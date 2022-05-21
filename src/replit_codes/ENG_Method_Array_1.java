package replit_codes;

import java.util.Arrays;

public class ENG_Method_Array_1 {
    //Write a return method to reverse number.
    //
    //Input : 12345
    //
    //Output : 54321
    public static void main(String[] args) {

        reverseMethod("12345");



    }

    private static String reverseMethod(String str) {

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        return str;
    }
}
