package replit_codes;

import java.util.Arrays;

public class ENG_Method_Array_4 {
    /*
    Create a custom return type method accepts a name as parameter and prints the name as a char array.

(do not use toCharArray() method)

Input : John

Output :[J, o, h, n]
     */
    public static void main(String[] args) {
        String name ="John";

        charArrayOlustur(name);
    }

    private static void charArrayOlustur(String name) {
        String arr[] =name.split("");
        System.out.println(Arrays.toString(arr));



        }




}
