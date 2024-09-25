import java.util.Scanner;
import java.util.Arrays;

public class anagram{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("INPUT 1: ");
        char[] strOne = scan.nextLine().toCharArray();
        System.out.print("INPUT 2: ");
        char[] strTwo = scan.nextLine().toCharArray();


        Arrays.sort(strOne);
        Arrays.sort(strTwo);
        if(strOne.length == strTwo.length){
            for(int i = 0; i < strOne.length; i++){
                if(strOne[i] != strTwo[i]){
                    System.out.println("NOT AN ANAGRAM");
                    System.exit(0);
                }
            } 

            System.out.println("IT IS AN ANAGRAM");
            System.exit(0);
        }else{
            System.out.println("NOT AN ANAGRAM");
            System.exit(0);
        }
    }
}