package free_practice;

import java.util.Scanner;

public class free6_if {
    // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
    //olmadigini yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin uzun kenarini girin: ");
        int uzunKenar = scan.nextInt();

        System.out.println("Lutfen dikdortgenin kisa kenarini girin: ");
        int kisaKenar = scan.nextInt();

        if(uzunKenar == kisaKenar){
            System.out.println("bu dikdörtgen ayni zamanda bir kare dir");
        }else System.out.println("bu dikdörtgen ayni zamanda bir kare degildir");

    }
}
