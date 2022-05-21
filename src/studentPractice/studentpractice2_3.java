package studentPractice;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class studentpractice2_3 {

    // Get a string from user and type code to find the number of words in a string

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle = scanner.nextLine();
        cumle = cumle.trim();

        String kelimeler [] = cumle.split(" ");
        int kelimeSayisi = kelimeler.length;
        System.out.println("kelime sayisi : "  + kelimeSayisi);


    }// main method
}
