package free_practice;

import java.util.Scanner;

public class free12_nestedif {
    //Soru11 Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
    //          Kullanicidan bir sifre girmesini isteyin
    //          Eger ilk harf buyuk harf ise “A" olup olmadigini kontrol edin
    //          Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
    //          Eger ilk harf kucuk harf ise “z" olup olmadigini kontrol edin
    //          Ilk harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen harfle baslayan bir sifre giriniz: ");
        String password = scan.nextLine();

        if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
            if (password.charAt(0) == 'A') {
                System.out.println("Gecerli Sifre");
            } else System.out.println("Gecersiz Sifre");

        } else if (password.charAt(0) >= 'a' && password.charAt(0) <= 'z') {
            if (password.charAt(0) == 'z') {
                System.out.println("Gecerli Sifre");
            } else System.out.println("Gecersiz Sifre");

        } else System.out.println("hatali giris yaptiniz, Lutfen harfle baslayan bir sifre giriniz: ");


    }//main method
}
