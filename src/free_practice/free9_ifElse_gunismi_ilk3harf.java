package free_practice;

import java.util.Scanner;

public class free9_ifElse_gunismi_ilk3harf {
    /*
    Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
gecerli degilse “Gecerli gun ismi giriniz” yazdirin

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi yaziniz: ");
        String gunIsmi = scan.nextLine().toUpperCase();

        String gun1 = "PAZARTESI";
        String gun2 = "SALI";
        String gun3 = "CARSAMBA";
        String gun4 = "PERSEMBE";
        String gun5 = "CUMA";
        String gun6 = "CUMARTESI";
        String gun7 = "PAZAR";


        if (gunIsmi.equals(gun1) ||
                gunIsmi.equals(gun2) ||
                gunIsmi.equals(gun3) ||
                gunIsmi.equals(gun4) ||
                gunIsmi.equals(gun5) ||
                gunIsmi.equals(gun6) ||
                gunIsmi.equals(gun7)) {
            System.out.println(gunIsmi.substring(0, 1) + gunIsmi.substring(1, 3).toLowerCase());

        } else System.out.println("Gecerli gun ismi giriniz");

    }

}
