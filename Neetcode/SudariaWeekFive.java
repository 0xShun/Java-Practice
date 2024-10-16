class SudariaWeekFive{
    public static int findMax(int a, int b, int c){
        int max = 0;
        int[] arr = {a, b, c};
        for(int n : arr){
            if(n > max){
                max = n;
            }
        }
        return max;
    }

    public static Boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int multiply(int a, int b){
        return a * b;
    }
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }
    public static int addNumbers(int a, int b){
        return a + b;
    }

    public static void greet(){
        System.out.println("Hello, Welcome to Java programming!");
    }

    public static void main(String[] args){
        greet();
        System.out.println("The sum is: " + addNumbers(1, 2));
        System.out.println("Multiplication of two numbers: " + multiply(21, 30));
        System.out.println("Multiplication of two numbers: " + multiply(21, 30, 100));
        System.out.println("Is 8 even? " + isEven(8));
        System.out.println("Is 7 even? " + isEven(7));
        System.out.println("Max of 35, 20, 15 is: " + findMax(35, 20, 15));
        System.out.println("Max of 65, 40, 30 is: " + findMax(65, 40, 30));

    }
}