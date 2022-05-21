package replit_codes;

import java.util.Arrays;

public class ENG_Method_Array_8 {
    /*
    Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2={5,6}

Output={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4};
        int arr2 [] = {5,6};

       createNewArray(arr1,arr2);

    }

    private static int[] createNewArray(int[] arr1, int[] arr2) {
        int arr3 [] = new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length;  i++) {
            arr3[i] = arr1[i];

        }
        for (int i = arr1.length; i <arr3.length;  i++) {
            arr3[i] = arr2[i-arr1.length];

        }

        System.out.println(Arrays.toString(arr3));
        return arr3;

    }
}
