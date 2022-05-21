package studentPractice.sP_okulYonetimi;

import java.util.Scanner;

public class AnaMenu implements AnamenuInterface {
    static Scanner scan = new Scanner(System.in);

    public static void giris() {
        AnaMenu object = new AnaMenu();

        System.out.println("OKUL YONETIMI");
        System.out.println("Lutfen Seciminizi Yapiniz");
        System.out.println("1 ogrenci islemleri    2 Ogretmen islemleri   Q - cikis");

        String secim = scan.next().toUpperCase();

        switch(secim) {
            case "1" :
                object.ogrenciIslemleri();
                break;
            case "2" :
                object.ogretmenIslemleri();
                break;
            case "Q" :
                object.cikis();
                break;
            default:
                System.out.println("Lutfen gecerli bir secim yapiniz");
                object.giris();
        }






    }

    @Override
    public void ogrenciIslemleri() {
        Islemler.IslemlerMenu(1);

    }

    @Override
    public void ogretmenIslemleri() {
        Islemler.IslemlerMenu(2);

    }

    @Override
    public void cikis() {

    }
}
