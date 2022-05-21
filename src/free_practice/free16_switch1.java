package free_practice;

import java.util.Scanner;

public class free16_switch1 {
    // Soru 1
    // Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bugun haftanin kacinci gunu? :");
        int gunSayisi = scanner.nextInt();

        switch (gunSayisi) {
            case 1:
                System.out.println("bugun gunlerden PAZARTESI");
                break;
            case 2:
                System.out.println("bugun gunlerden SALI");
                break;
            case 3:
                System.out.println("bugun gunlerden CARSAMBA");
                break;
            case 4:
                System.out.println("bugun gunlerden PERSEMBE");
                break;
            case 5:
                System.out.println("bugun gunlerden CUMA");
                break;
            case 6:
                System.out.println("bugun gunlerden CUMARTESI");
                break;
            case 7:
                System.out.println("bugun gunlerden PAZAR");
                break;
            default:
                System.out.println("Lutfen gun sayisini dogru giriniz");
        }


    }//main method
}
