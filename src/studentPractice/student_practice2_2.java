package studentPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class student_practice2_2 {

    // find the vowels in a string by using array
    // and print them on the console
    // a e i o u
    public static void main(String[] args) {

        String str = "insandan doganlar insan olurlar";
        String arr[] = str.split("");

        for (int i = 0; i < arr.length; i++) {
            if (
                    arr[i].equalsIgnoreCase("a") ||
                            arr[i].equalsIgnoreCase("e") ||
                            arr[i].equalsIgnoreCase("i") ||
                            arr[i].equalsIgnoreCase("o") ||
                            arr[i].equalsIgnoreCase("u")
            ) {
                System.out.print(arr[i] + " ");

            }

        }
    } // main method
}
