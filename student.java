import java.util.Scanner;

public class student {
    public static float avg(float a, float b, float c) {
        float _avg = (a + b + c) / 3;
        return _avg;
    }

    public static String grade(float _AVG){
        if(_AVG >= 98){
            return "Grade: A+";
        }else if(_AVG >= 95.00 && _AVG < 98){
            return "Grade: A";
        }else if(_AVG >= 92.00 && _AVG < 95.00){
            return "Grade: A-";
        }else if(_AVG >= 89.00 && _AVG < 92.00){
            return "Grade: B+";
        }else if(_AVG >= 87.00 && _AVG < 89.00){
            return "Grade: B";
        }else if (_AVG >= 84.00 && _AVG < 87.00){
            return "Grade: B-";
        }else if(_AVG >= 81.00 && _AVG < 84.00){
            return "Grade: C+";
        }else if(_AVG >= 78.00 && _AVG < 81.00){
            return "Grade: C";
        }else if(_AVG >= 75.00 && _AVG < 78.00){
            return "Grade: C-";
        }else{
            return "FAILED";
        }

    }

    public static void main(String[] args){
        Scanner uInput = new Scanner(System.in);
        System.out.print("Name: ");
        String name = uInput.nextLine();
        System.out.print("Age: ");
        int age = uInput.nextInt();

        int[] scores = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.printf("Score %d: ", i+1);
            scores[i] = uInput.nextInt();
        }
        
        float _AVG = avg(scores[0], scores[1], scores[2]);
        System.out.println("Average Score: " + _AVG);
        System.out.println(grade(_AVG));
       
    }


}