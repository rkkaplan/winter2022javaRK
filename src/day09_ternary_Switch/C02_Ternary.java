package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // Ternary ile yapilan tum islemler if else ile de yapilabilr.
        // if Else yerine Ternary nin tercih edilmesinin sebebi yapinin basit ve anlasilir olmasidir
        // TErnary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya bizi sonuca goturen basit islemler olabilir

        //kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz ");
        int sayi = scanner.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cift");
        } else {
            System.out.println("sayi tek");
        }


        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

    }
}
