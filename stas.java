public class stas {
    public static void main(String[] args){
        int[] data = {15, 16, 18, 18, 19, 20, 20, 21, 22, 22, 25, 25, 25, 25, 30, 33, 33, 35, 35, 35, 35, 36, 40, 45, 46, 52, 70, 75, 78};
        float sum = 0.0f;
        for(int num : data){
            sum += (float) num;
        }

        System.out.println((float)(sum / data.length));
        int length = data.length;
        if (length == 0){

        }else{
            System.out.println(data[(int)(data.length/2) - 1]);
        }
    }
}
15, 16, 18, 18, 19, 20, 20, 21, 22, 22, 25, 25, 25, 25, 30, 33, 33, 35, 35, 35, 35, 36, 40, 45, 46, 52, 70, 75