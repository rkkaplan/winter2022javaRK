package day10_switch_StringManipulation;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {

        //Kullanicidan Deger Alma Sorular
        //Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki adet tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("iki sayinin toplami: " + (sayi1+sayi2));
        System.out.println("iki sayinin farki: " + (sayi1-sayi2));
        System.out.println("iki sayinin carpimi: " + (sayi1*sayi2));




    }
}
