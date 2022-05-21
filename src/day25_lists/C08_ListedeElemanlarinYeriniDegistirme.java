package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {
        // Verilen bir listede istenen iki indexteki
        // elementlerin yerini kalici
        // olarak degistiren bir method olusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex = 2;
        int ikinciIndex = 5;

        sayilar = swapEleents(sayilar, ilkIndex, ikinciIndex);
    }

    public static List<Integer> swapEleents(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        //bir tem sayi olusturup
        // verilen indexlerdekisayilari yer degistirin
        //indexleri kontrol edip sinirin otesinde index verildiyse........................





        return sayilar;
    }

}
