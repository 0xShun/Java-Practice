import java.util.Scanner;
import java.util.Random;

public class week3 {
    public static void QuestionFive(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("INPUT: ");
        String[] input = uInput.nextLine().split("\\s+");
        System.out.print("OUTPUT: ");
        for(int i = input.length - 1; i >= 0; i--){
            System.out.printf("%s ", input[i]);
        }
    }
    
    public static void QuestionFour(){
        Random random = new Random();
        int rand = random.nextInt(100) + 1;
        Scanner uInput = new Scanner(System.in);
        int tries = 0;
        boolean flag = false;
        while(!flag){
            System.out.print("Guess: ");
            int input = uInput.nextInt();
            if(input == rand){
                System.out.println("You got it right!! TRIES: " + tries);
                flag = true;
            }else{
                tries++;
                System.out.println(input > rand ? "Lower" : "Higher");
            }
        }

    }

    public static void QuestionThree(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("Nth number: ");
        int input = uInput.nextInt();
        int sum = 0;
        for(int i = 1; i <= input; i++){
            sum += i;
        }

        System.out.println("The total sum is: " + sum);
    }

    public static void QuestionTwo(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("NUMBER: ");
        int input = uInput.nextInt();
        switch(input){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Number not within range");
                QuestionTwo();
                
            
        }
    }

    public static void QuestionOne(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("INPUT: ");
        int input = uInput.nextInt();

        if(input % 2 == 0){
            System.out.println("It is even");
        }else{
            System.out.print("It is odd");
        }
    }


    public static void main(String args[]){
        QuestionFive();
    }

}