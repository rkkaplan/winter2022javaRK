package replit_codes;

public class ENG_Method_Array_7 {
    /*
    Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

Eg :

input : {1,2,3,4,5,6,7,8};

output: 36
     */
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        System.out.println("output: " + arraydekleriTopla(arr));




    }

    private static int arraydekleriTopla(int[] arr) {
        int output = 0;
        for (int i = 0; i < arr.length; i++){
            output += arr[i];

        }
        return output;
    }


}


