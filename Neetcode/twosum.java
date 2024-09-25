import java.util.Arrays;

public class twosum{
    public int[] TwoSum(int[] nums, int target){
        int[] Indices = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    Indices[0] = i;
                    Indices[1] = j;
                    return Indices;
                }
            }
        }

        return Indices;
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twosum solution = new twosum();
        int[] result = solution.TwoSum(nums, target);
        
        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Target sum: " + target);
        System.out.println("Indices of two numbers: " + Arrays.toString(result));
    }
}