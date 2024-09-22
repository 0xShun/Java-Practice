import java.util.HashMap;
import java.util.Map;

public class one {
    
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> pair = new HashMap<>();
        if(s.length() == t.length()){
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(pair.containsKey(ch)){
                    pair.replace(ch, pair.get(ch)+1);
                }else{
                    pair.put(ch, 1);
                }
            }
        }else{
            return false;
        }
        return true;
    }


    
    public static void main(String[] args) {
        // Test case for isAnagram function
        one anagramChecker = new one();
        String s1 = "listen";
        String t1 = "silent";
        System.out.println("Test case 1: " + s1 + " and " + t1);
        System.out.println("Is anagram? " + anagramChecker.isAnagram(s1, t1));

        String s2 = "hello";
        String t2 = "world";
        System.out.println("Test case 2: " + s2 + " and " + t2);
        System.out.println("Is anagram? " + anagramChecker.isAnagram(s2, t2));
    }
}
