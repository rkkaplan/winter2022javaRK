package free_practice;

import java.util.Scanner;

public class free7_ifElse {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdörtgenin kenar uzunluklarını girin: "  +  "\nkisa kenar: " );
        int kisaKenar = scan.nextInt();
        System.out.println("uzun kenar: " );
        int uzunKenar = scan.nextInt();

        if (kisaKenar==uzunKenar) {
            System.out.println("dikdörtgeniniz ayni zamanda bir karedir");
        } else System.out.println("dikdörtgeniniz ayni zamanda bir kare değildir");


    }
}
