package free_practice;

import java.util.Scanner;

public class free4_ifStatements {
    //  Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
    //  isimlerini yazdirin
    //  Ornek:
    //  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
    //  ilkHarf=S output = “Sali”
    //  *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen haftanin günlerinden birinin ilk harfini girin: ");
        String harf = scan.next().toLowerCase();

        if (harf.equals("p")) {
            System.out.println("pazartesi, persembe, pazar");
        } else if (harf.equals("c")) {
            System.out.println("cuma, cumartesi");
        } else {
            System.out.println("bu harf ile baslayan gun yoktur. ");
        }

    }
}
