import java.util.Scanner;

public class week4 {
    public static void QuestionFive(){
        int[] arr = {150, 5, 7, 8, 19, 40, 100, 34, 12, 89, 86, 94, 82, 43, 54, 15, 19, 22, 33, 38, 35, 50};
        System.out.print("Unsorted Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        int len = arr.length;
        boolean wasSwapped;
        for(int i = 0; i < len - 1; i++){
            wasSwapped = false;
            for(int j = 0; j < len - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    wasSwapped = true;
                }
            }

            if (wasSwapped == false){
                break;
            }
        }
        System.out.print("\n\nSorted Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void QuestionFour(){
        int[][] matrixOne = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixTwo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        int rows = matrixOne.length;
        int cols = matrixOne[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {            
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        System.out.println("Result of matrix addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void QuestionTwo(){
        Scanner uInput = new Scanner(System.in);
        System.out.print("INPUT: ");
        boolean flag = true;
        String input = uInput.nextLine();
        char[] str = input.toCharArray();
        int lastEl = str.length - 1;
        for(int i = 0; i < str.length; i++){
            if(str[i] != str[lastEl]){
                System.out.println(input + " is not palindrome");
                flag = false;
                break;
            }
            lastEl--;
        }

        if(flag == true){
            System.out.println(input + " is a palindrome");
        }
    }
    
    public static void QuestionOne(){
        int[] nums = new int[10];
        int biggest = 0;
        int smallest = 100;
        Scanner uInput = new Scanner(System.in);        
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            nums[i] = uInput.nextInt();
            if(nums[i] > biggest){
                biggest = nums[i];
            }

            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }

        System.out.printf("The Maximum value: %d\n", biggest);
        System.out.printf("The Minimum value: %d\n", smallest);

        System.out.print("The array elements: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    
    public static void main(String[] args){
        QuestionFive();

    }
}