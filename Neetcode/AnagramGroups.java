import java.util.*;

class AnagramGroups {

    public Boolean isAnagram(String one, String two){
        char[] one = one.toCharArray();
        char[] two = two.toCharArray();
        Boolean flag = true;
        int len = one.length - 1;

        for(int i = 0; i < one.length; i++){
            if()
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        
        for(int i = 0; i < group.size(); i++){
            
            for(int j = i + 1; j < group.size(); i++){
                
            }
        }


        return group;
    }

    public static void main(String[] args){
   
        AnagramGroups solution = new AnagramGroups();
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Expected: [[\"eat\",\"tea\",\"ate\"],[\"tan\",\"nat\"],[\"bat\"]], Got: " + solution.groupAnagrams(strs1));
        
        }
}