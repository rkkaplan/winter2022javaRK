package free_practice;

import java.util.Scanner;

public class free3_ifStatements {
    // Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi girin: ");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("girdiginiz " + sayi + " sayisi bir cift sayidir");

        } else System.out.println("girdiginiz " + sayi + " sayisi bir tek sayidir");


    }

}
