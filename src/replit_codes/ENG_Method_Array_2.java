package replit_codes;

public class ENG_Method_Array_2 {
    /*
Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input : Coding is greate.

Output : .etaerg si gnidoC
     */

    public static void main(String[] args) {
        String str = "Coding is greate.";
        String arr[] = str.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }


    }//main
}
