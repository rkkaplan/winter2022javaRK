package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);

        //remove(istenenObject) method'u istenen elementi kaldirip
        //bize true/dalse doner
        //eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        //method'u boolean bir variable a atayabilrsiniz


        boolean sonuc=isimler.remove("Oguzhan"); // true
        //sonucu kullaniciya yazdirmak isterseniz
        //if/else ile istediginiz degerlendirmeyi yazabilirsiniz


        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }


        System.out.println(isimler);
        sonuc=isimler.remove("Berk");

        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }
        //remove(index) yazdigimizda sildim/silmedim ihtimali kalmaz
        //bize remove edilen elementi doner

        System.out.println(isimler.remove(1));//Yusuf'u siler ve
                                                    // delil olarak Yusuf ismini bize dondurur
        //yazdirsak da yazdirmasak da liste degisti ve 1.indexteki element silindi
        System.out.println(isimler); //[Aykut, Ilker]
    }
}
