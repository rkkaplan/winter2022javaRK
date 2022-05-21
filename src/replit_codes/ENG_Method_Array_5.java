package replit_codes;

public class ENG_Method_Array_5 {
    /*
    Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
     */
    public static void main(String[] args) {

        int average = 0;
        calculateAverage(average);
    }

    private static int calculateAverage(int average) {
        int arr [] =   {1,2,3,4,5,6,7};
        int sum = 0;
        average = 0;

        for (int i = 0; i < arr.length; i++) {
         sum+=arr[i];
         average = sum/arr.length;

        }
        System.out.println("Output: " + average);

        return average;
    }
}
