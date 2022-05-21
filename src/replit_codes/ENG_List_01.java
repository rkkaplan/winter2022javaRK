package replit_codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ENG_List_01 {
    /*
    Write a Java program to get a String from user as input
    and find the maximum occurring character in that string. (Ignore case sensitivity)

input : Learning java is easy
output: maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a String expression: ");
        String str = scan.nextLine();

        String newStr =str.replaceAll("\\W", "");
        String arr [] = newStr.split("");
        List<String> list1 = new ArrayList<>(Arrays.asList(arr));
        int count = 0;
        for (String e :list1
             ) {

        }

    }
}
