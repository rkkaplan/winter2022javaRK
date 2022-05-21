package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //kullaniciya derse katilip katilmak istmedigini sorun
        //evet derse "derse katiliminiz onaylanmistir" yazdirin
        //hayir derse "Sonraki derslerimize bekleriz"yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("derse katilmak ister misiniz? \nEvet veya Hayir yaziniz");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz: " + cevap + " derse katiliminiz onaylanmistir" );
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz: " + cevap + " Sonraki derslerimize bekleriz");
        } else {
            System.out.println("Lutfen evet veya hayir yaziniz");
        }
    }
}
