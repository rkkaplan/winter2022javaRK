package free_practice;

import java.util.Scanner;

public class free13_nestedIf {
    //Soru 12
    //          Kullanıcıdan 4 basamakli bir sayi girmesini isteyin
    //          Girdiği sayi 5 ’e bölünüyorsa son rakamını kontrol edin
    //          Son rakamı 0 ise ekrana 5 ’e bölünen çift sayı” yazdırın
    //          Son rakamı 0 değil ise 5 ’e bölünen tek sayı” yazdırın
    //          Girdiği password 5 ’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi >= 1000 && sayi <= 9999) {
            if (sayi % 5 == 0) {
                if (sayi % 10 == 0) {
                    System.out.println(sayi + " 5 ’e bölünen çift sayı");
                } else System.out.println(sayi + " sayisi 5 ’e bölünen bir tek sayidir");
            } else System.out.println("tekrar deneyin");

        } else System.out.println("Hatali giris yaptiniz, Lutfen 4 basamakli bir sayi giriniz: ");


    }  //main method
}
