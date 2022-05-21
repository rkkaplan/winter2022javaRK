package free_practice;

import java.util.Scanner;

public class free14_ternary {
    public static void main(String[] args) {

        // Soru 1 Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        // int sayi1 = 5;
        // int sayi2 = 10;
        // System.out.println(sayi1<sayi2 ? sayi1 : sayi2);

        //Soru 2 Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
        // int sayi3 = 60;
        // System.out.println(sayi3 % 2 == 0 ? "Çift sayi" : "tek sayi");


        // Soru 3 Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        // int sayi4 = 0;
        // System.out.println(sayi4 >=0 ? sayi4 : (sayi4*-1));

        // Soru 4 Kullanicidan bir sayi alin
        // Sayi pozitifse “Sayi pozitif” yazdirin, negatifse sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz: ");

        int num6 = scan.nextInt();

        System.out.println(num6>0 ? "sayi pozitif" : (num6 ==0 ? "sayi sifir" : num6*num6 ));




    }//main method
}
