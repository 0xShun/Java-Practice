public class palindrome {
    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();

        // Remove non-alphanumeric characters from the char array
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < str.length; readIndex++) {
            if (Character.isLetterOrDigit(str[readIndex])) {
                str[writeIndex] = Character.toLowerCase(str[readIndex]);
                writeIndex++;
            }
        }
        // Create a new char array with only alphanumeric characters
        char[] cleanStr = new char[writeIndex];
        System.arraycopy(str, 0, cleanStr, 0, writeIndex);
        str = cleanStr;

        int counter = 0;
        for(int i = s.length() - 1; i >= 0; i--){
           if(str[i] != str[counter]){
                return false;
           } 

           counter++;
        }

        return true;
    }
    public static void main(String[] args){
        palindrome solution = new palindrome();
        String testString1 = "racecar";
        String testString2 = "hello";
        
        System.out.println("Test case 1: " + testString1);
        System.out.println("Is palindrome? " + solution.isPalindrome(testString1));
        
        System.out.println("Test case 2: " + testString2);
        System.out.println("Is palindrome? " + solution.isPalindrome(testString2));
    }
}