package free_practice;

import java.util.Scanner;

public class free2Concatenation {
    public static void main(String[] args) {

        //output:
        //     1) Java Guzel 54
        //     2) Java 5 Guzel
        //     3) Java 94
        //     4) Java 19
        //     5) 54 Guzel
        Scanner scan = new Scanner(System.in);
        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 4;

        System.out.println("1) " + str1 + " " +  str2 + " " + sayi1 + sayi2 );
        System.out.println("2) " + str1 + " " +  sayi1 + " " + str2 );
        System.out.println("3) " + str1 + " " +  (sayi1 + sayi2) + sayi2 );
        System.out.println("4) " + str1 + " " +  (sayi1 - sayi2) + (sayi1 + sayi2) );
        System.out.println("5) " + sayi1 + sayi2 + " " + str2  );


    }
}
