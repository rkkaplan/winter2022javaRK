package free_practice;

import java.util.Scanner;

public class free11_ifElse {
    // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
    //           Not’u harf sistemine cevirip yazdirin.
    //           50’den kucukse “D”,
    //           50 60 arasi “C”,
    //           60 80 arasi “B”,
    //           80’nin uzerinde ise “A”

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100 uzerinden notunuzu girin: ");
        double not = scan.nextDouble();
        if (not > 80) {
            System.out.println("notunuzun harf degeri: A ");
        } else if (not > 60 && not <= 80) {
            System.out.println("notunuzun harf degeri: B ");
        } else if (not > 50 && not <= 60) {
            System.out.println("notunuzun harf degeri: C ");
        } else if (not <= 50 && not >= 0) {
            System.out.println("notunuzun harf degeri: D ");
        } else {
            System.out.println("lutfen gecerli harf degeri giriniz");
        }

    }
}
