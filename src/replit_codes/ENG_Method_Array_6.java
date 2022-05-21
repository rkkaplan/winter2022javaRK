package replit_codes;

import static java.util.Arrays.sort;

public class ENG_Method_Array_6 {
    /*
    Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :

min: 1

max: 6
     */

    public static void main(String[] args) {
        int arr [] = {3,2,5,4,1,6};
        calculateMinAndMax(arr);

    }

    private static void calculateMinAndMax(int[] arr) {
        sort(arr);
        int minimum =arr[0];
        int maximum =arr[arr.length - 1];
        System.out.println("min: " + minimum  );
        System.out.println("max: " + maximum  );

    }


}
