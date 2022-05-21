package free_practice;

import java.util.Locale;
import java.util.Scanner;

public class free18_switchSDET {

    // Soru4 Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
    //          Kullanici S girerse “SOFTWARE"
    //                    D girerse “DEVELOPER"
    //                    E girerse “ENGINEER
    //                    T girerse “In Testing” yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("SDET kisaltmasindaki harflerden birini yaz: ");
        String input = scan.next().toUpperCase();


        //char harf = Character.toUpperCase(scan.next().charAt(0));
        // char harf2 = scan.next().toUpperCase().charAt(0);
        // String harf3 = scan.next().toUpperCase().substring(0,1);


        if (input.length() != 1) {
            System.out.println("lütfen tek harfli bi kelime giriniz");
            return;
        }
        switch (input) {
            case "S":
                System.out.println("SOFTWARE");
                break;
            case "D":
                System.out.println("DEVELOPER");
                break;
            case "E":
                System.out.println("ENGINEER");
                break;
            case "T":
                System.out.println("IN TESTING");
                break;
            default:
                System.out.println("hatalı giris");

        }

    }


}
