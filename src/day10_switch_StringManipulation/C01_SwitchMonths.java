package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchMonths {
    public static void main(String[] args) {
        // kullanicidan ssayi olarak kacinci ay oldugunuı alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi zor olabilir
        // bunun yerine switch case yapisini kullanabiliriz

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");
        }
        //switch icine yazilan variable in degerine gore
        //ilgilicase i bulu ve break gorene kadar kodu calistirir
        //eger break yoksa ilgili caseden asagi dogru tum case ler calisir


    }
}
