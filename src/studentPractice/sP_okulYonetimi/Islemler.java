package studentPractice.sP_okulYonetimi;

import java.util.Scanner;

public class Islemler implements IslemlerInterface {
    static Scanner scan = new Scanner(System.in);
    static int secim = 0;


    public static void IslemlerMenu(int i) {
        secim = i;
        Islemler object2 = new Islemler();

        System.out.println("Lutfem secim yapiniz: ");
        System.out.println("1 ekleme 2 arama 3 listeleme 4 silme 5 anamenu 6 cikis");

        int scm = scan.nextInt();                 //try catch

        switch (scm){
            case 1:
                object2.ekleme();
                IslemlerMenu(secim);
                break;
            case 2:
                object2.arama();
                IslemlerMenu(secim);
                break;
            case 3:
                object2.listeleme();
                IslemlerMenu(secim);
                break;
            case 4:
                object2.silme();
                IslemlerMenu(secim);
                break;
            case 5:
                object2.anaMenu();
                IslemlerMenu(secim);
                break;
            case 6:
                object2.cikis();
                IslemlerMenu(secim);
                break;

        }


    }

    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anaMenu() {

    }

    @Override
    public void cikis() {

    }
}
