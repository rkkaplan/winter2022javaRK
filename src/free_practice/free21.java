package free_practice;

import java.util.Scanner;

public class free21 {
    //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
    //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
    //-Girilen kelime cumlede kullanilmamis.
    //-Girilen kelime cumlede 1 kere kullanilmis.
    //-Girilen kelime cumlede 1’den fazla kullanilmis.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin: ");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir kelime girin: ");
        String kelime = scan.nextLine();

        int firstUsing = cumle.toLowerCase().indexOf(kelime.toLowerCase());
        int secondUsing = cumle.toLowerCase().indexOf(kelime.toLowerCase(), firstUsing + 1);

        if (firstUsing == -1) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (firstUsing == secondUsing) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");

        } else System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
    }
}
