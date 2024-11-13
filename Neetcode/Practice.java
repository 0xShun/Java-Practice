import java.util.Scanner;
import java.util.Arrays;
class Practice{
    static void qThree(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int len = Integer.parseInt(s.nextLine());

        s.close();

        for(int i = 1; i <= len; i++){
            for(int j = 1; i <= len - i; j++){
                System.out.print(" ");
            }

            for(int h = 1; h <= 2 * i - 1; h++){
                if(h == 1 || h == 2 * i - 1 || i == len){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static String qTwo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Word: ");
        String w = s.nextLine();
        char[] word = w.toCharArray();
        int len = word.length - 1;
    
        for(int i = 0; i < word.length; i++){
            if(Character.toLowerCase(word[i]) != Character.toLowerCase(word[len])){
                return "Not Palindrome";
            }
            len--;
        }

        return "Palindrome";
    }

    static void qOne(){
        char[] A = {'a','o','b','m','f','c','j','e','y'};
        char[] B = {'n','e','y','d','r','z','o','j','x'};

        char[] intersection = new char[A.length];
        int counter = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(A[i] == B[j]){
                    boolean found = Arrays.asList(intersection).contains(A[i]);
                    if(!found){
                        intersection[counter] = A[i];
                        counter++;
                    }
                }
            }
        }

        System.out.print("Intersection: ");
        for(char c : intersection){
            System.out.print(c + " ");
        }
    
    }
    public static void main(String[] args){
        // qOne();
        // System.out.println(qTwo());
        qThree();
    }
}