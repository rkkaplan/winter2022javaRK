package free_practice;

import java.util.Scanner;

public class free15_ternaryNested {

    public static void main(String[] args) {
        //Soru 1 Kullanicidan bir tamsayi alin ve sayi 10 ’dan kucukse "Rakam"
        // 100 ’den kucukse “iki basamakli sayi”
        //          degilse “uc basamakli veya daha buyuk sayi” yazdirin
      /*
       Scanner scan = new Scanner(System.in);
       System.out.println("Lutfen bir tamsayi giriniz: ");
       int sayi = scan.nextInt();
       System.out.println((sayi < 10 && sayi >= 0) ? "Rakam" : (sayi < 100 ? "iki basamakli sayi" :
               "uc basamakli veya daha buyuk sayi"));
       */

        // Soru2 Kullanicidan bir harf isteyin
        // kucuk harf ise consola “Kucuk Harf”
        // buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin: ");
        char harf = scan.next().charAt(0);
        System.out.println((harf>='a' && harf<='z') ? "Kucuk harf" : ((harf>='A' && harf<='Z') ?
                "Buyuk Harf" : "Girdiginiz karakter harf degil"));
       */

        //Soru 4 Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
        //       girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin genisligini giriniz: ");
        int genislik = scan.nextInt();
        System.out.println("Lutfen dikdortgenin uzunlugunu giriniz: ");
        int uzunluk = scan.nextInt();
        System.out.println((genislik == uzunluk) ? "dikdortgen bir kare" : "dikdortgen bir kare degil");
        */

        // Soru
        //5 Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa “Uc
        //basamakli degil” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println((sayi>=100 && sayi <=999) ? "uc basamakli sayi" : "uc basamakli sayi degil" );
    }

}
