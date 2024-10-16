public class validAnagram {

    public int maxProfit(int[] prices) {
            
    }

    public static Boolean isValidAnagram(String str){
        char[] stripped = str.replaceAll("[\s[^a-zA-Z0-9]]", "").toCharArray();
        int len = stripped.length - 1;
        System.out.println(stripped);
        Boolean isAnagram = true;

        for(int i = 0; i < stripped.length; i++){
            
            if(Character.toLowerCase(stripped[i]) != Character.toLowerCase(stripped[len])){
                isAnagram = false;
                break;
            }
            len--;
        }

        return isAnagram;

    }

    public static void main(String[] args){
        
    }
}