package free_practice;

import java.util.Scanner;

public class free10_ifElse {
    // Soru 6) Kullanicidan iki sayi isteyin,
    //        sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
    //        sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
    //        sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
    //        sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen bir tamsayi daha  giriniz: ");
        int sayi2 = scan.nextInt();

        if (sayi1>0 && sayi2>0) {
            System.out.println("sayi1 + sayi2 = " + (sayi1 + sayi2));
        } else if (sayi1<0 && sayi2<0){
            System.out.println("sayi1 * sayi2 = " + sayi1 * sayi2);
        } else if(sayi1*sayi2<0) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
    }
}
