package free_practice;

import java.util.Scanner;

public class free8_ifElse {
    //Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
    //calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        if (yas<65 && yas>=0) {
            System.out.println("emekli olamazsin, calismalisin");
        } else if (yas>= 65) {
            System.out.println("Emekli olabilirsin");
        }

    }
}
