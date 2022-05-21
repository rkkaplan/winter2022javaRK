package free_practice;

import java.util.Scanner;

public class asalMi {
    public static void main(String[] args) {
        // girilen sayi asal mi degil mi bir method olusturun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen asal olup olmadigini ogrenmek istediginiz bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(asalMi(sayi));
    }

    private static boolean asalMi(int sayi) {
        // sayı 2 den büyükse değerlendirmeye alcaz
        //değilse false döncez.
        //2 ye eşit veya ikiden büyükse kendisi ve 1 haricinde tam boleni olup olmadığını kontrol etcez;
        // eğer bu aralıkta tam böleni varsa false dönecek
        //eğer tam böleni yoksa true döncez
        if (sayi >= 2) {
            for (int bolen = 2; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }

}
