package free_practice;

import java.util.Scanner;

public class free5_if {
    // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
    //Ornek:
    //gun=Pazar output = “Hafta sonu”
    //gun=Sali output = “Hafta ici”
    //*** String icin equals method’unu kullanin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz: ");
        String gunIsmi = scan.nextLine().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("Hafta Sonu");
        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")){
            System.out.println("hafta ici");

        }
        else System.out.println("Lutfen gun ismini duzgun giriniz");


    }
}
