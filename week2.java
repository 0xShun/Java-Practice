import java.util.Scanner;
import java.util.HashMap;

public class week2 {
    public static boolean QuestionFive(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("INPUT: ");
        String input = uInput.nextLine().toLowerCase();
        boolean bool = input.equals("true");

        return bool;

    }
    public static boolean QuestionFour(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("INPUT: ");
        char first_letter = uInput.nextLine().charAt(0);

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(char c : vowels){
            if(first_letter == c){
                return true;
            }
        }

        return false;
    }

    public static boolean QuestionThree(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("String 1: ");
        String strOne = uInput.nextLine().toLowerCase();
        System.out.print("String 2: ");
        String strTwo = uInput.nextLine().toLowerCase();

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        if(strTwo.length() == strOne.length()){
                for(char c : strOne.toCharArray()){
                    if(charMap.containsKey(c)){
                        charMap.replace(c, charMap.get(c) + 1);
                    }else{
                        charMap.put(c, 1);
                    }
                }

                for(char chr : strTwo.toCharArray()){
                    if(charMap.containsKey(chr)){
                        charMap.remove(chr);
                    }
                }

                return charMap.isEmpty();
                
        }else{
            return false;
        }
    }
    
    public static int QuestionTwo(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = uInput.nextLine();
        System.out.print("Enter a character: ");
        char chr = uInput.nextLine().charAt(0);
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == chr){
                counter++;  
            }
        }
        return counter;
    }

    public static boolean QuestionOne(){ 
        Scanner uInput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = uInput.nextLine();
        

        int lenCounter = str.length()-1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(lenCounter)){
                return false;
            }
            lenCounter--;
        }
        return true;
    }

    
    public static void main(String[] args) {
        // System.out.println(QuestionOne());
        // System.out.printf("Number of times the character chosen appears: %d ", QuestionTwo());
        // System.out.println("Is anagram = " + QuestionThree());
        // System.out.println("Does it start with a vowel? " + QuestionFour());
        // System.out.println("OUTPUT: " + QuestionFive ());
    }
}
