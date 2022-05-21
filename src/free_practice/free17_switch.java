package free_practice;

import java.util.Scanner;

public class free17_switch {
    // Soru 2
    // Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bu ay senenin kacinci ayi?: ");
        int aySayisi = scanner.nextInt();

        switch (aySayisi) {
            case 1:
                System.out.println("bu ay aylardan OCAK");
                break;
            case 2:
                System.out.println("bu ay aylardan SUBAT");
                break;
            case 3:
                System.out.println("bu ay aylardan MART");
                break;
            case 4:
                System.out.println("bu ay aylardan NISAN");
                break;
            case 5:
                System.out.println("bu ay aylardan MAYIS");
                break;
            case 6:
                System.out.println("bu ay aylardan HAZIRAN");
                break;
            case 7:
                System.out.println("bu ay aylardan TEMMUZ");
                break;
            case 8:
                System.out.println("bu ay aylardan AGUSTOS");
                break;
            case 9:
                System.out.println("bu ay aylardan EYLUL");
                break;
            case 10:
                System.out.println("bu ay aylardan EKIM");
                break;
            case 11:
                System.out.println("bu ay aylardan KASIM");
                break;
            case 12:
                System.out.println("bu ay aylardan ARALIK");
                break;
            default:
                System.out.println("Lutfen ay sayisini dogru giriniz");
        }


    }//main method
}
