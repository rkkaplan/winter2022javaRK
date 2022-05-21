package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        kullanicidan yasini isteyin
        kullanici yas olarak negatif bir sayi , 0 veya 120'den buyuk bir sayi girerse
        illegalArgumentException olusacak sekilde bir program yaziniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scanner.nextInt();


        if (yas <= 0 || yas > 120) {
            //System.out.println("Lutfen gecerli bir yas giriniz");
            //Java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();
        } else System.out.println("Uygun yas girdiniz tesekkurler.");
    }
}
