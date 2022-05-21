package LAMBDA_HALUKHOCA;

import java.util.*;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> yemek = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilece", "havucDilim","adana", "buryan",
                                                            "yaglama", "kokorec", "adana","arabasi", "guvec", "adana", "Waffle"));
        alfBuyukTekrarsiz(yemek);
        System.out.println("\n     ****    ");
        charSayisiTersTekrarsiz(yemek);
        System.out.println("\n     ****    ");
        charSayisiBuyuktenKucugeSirala(yemek);
        System.out.println("\n     ****    ");
        sonharfTerssirali(yemek);
        System.out.println("\n     ****    ");
        ciftKareBuyKucTekrarsiz(yemek);
        System.out.println("\n     ****    ");
        harfSayisiYedidenAzKontrol(yemek);
        System.out.println("\n     ****    ");
        wIleBaslayaniKontrol(yemek);
        System.out.println("\n     ****    ");
        xIleBitenElKontrol(yemek);
        System.out.println("\n     ****    ");
        charSayisiBuyukElYazdir(yemek);
        System.out.println("\n     ****    ");
        ilkElHarcSonHrfSiraliPrint(yemek);


    }//main method

    /* 1. Task : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.

     */
    public static void alfBuyukTekrarsiz(List<String> yemek){
        yemek.stream().
                map(t-> t.toUpperCase()).//elemanlar buyuk harfe  cevrildi   -----> "Lambda Expression"
                //burda map(String::toUpperCase()) de yapilabilirdi           ---->  "Method Reference"
                sorted().//alfabetik Natural Order yapti
                distinct().//farkli, benzersiz,tekrarsiz hale geldi
                forEach(t->System.out.print(t+" "));// print etti.Lambda01::yazdir olmadi cunku data type string degil!!!

        //              ----------------- DISTINCT METHODU  -----------------
        /*
        distinct() =>
        Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        Sıralı akışlar için, farklı elemanın seçimi sabittir
        (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
         */

    }
    /*
    2. Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
     */
    public static void charSayisiTersTekrarsiz(List<String>yemek){
        yemek.stream().
                map(String::length).
                //veya map(t-> t.length()) da olabilir
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(t-> System.out.print(t + " "));
                //sonuc integer olacagi icin forEach(Lambda01::yazdir) da olabilirdi.
    }
    /*
    3. Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
     */
    public static void charSayisiBuyuktenKucugeSirala(List<String>yemek){
        yemek.stream().
                sorted(Comparator.
                        comparing(String::length)).
                forEach(t-> System.out.print(t+ " "));
    }
    /*
    4. Task : list elemanlarinin son harfine gore ters sirali print ediniz.
     */
    public static void sonharfTerssirali(List<String>yemek){
        yemek.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
                forEach(t-> System.out.print(t+ " "));
    }
    /*
      5. Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

     */
    public static void ciftKareBuyKucTekrarsiz(List<String>yemek){
        yemek.stream().map(t->t.length()*t.length()).filter(Lambda01::ciftBul).sorted(Comparator.reverseOrder()).forEach(Lambda01::yazdir);
    }
    /*
     6. Task : List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

     */
    public static void harfSayisiYedidenAzKontrol(List<String>yemek){
        //amele code :)
        System.out.println("amele code :) : ");
        boolean kontrol = yemek.stream().allMatch(t->t.length()<=7);
        if (kontrol){
            System.out.println("elemanlar 7 veya daha kucuk harfli");
        }else System.out.println(" ");
        System.out.println(kontrol);
        System.out.println("cincix code ile : ");
        System.out.println(yemek.stream().
                allMatch(t -> t.length() <= 7) ? "elemanlar 7 veya daha kucuk harfli" : "yemek listesi elemanlari arasinda 7 harften buyuk olan da var");

    }
    //////////////////////--------------------------anyMatch-----allMatch------noneMatch-----------------------\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    /*
    //anyMatch() --> en az bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
     */
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
        7. Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.

     */
    public static void wIleBaslayaniKontrol(List<String>yemek){
        System.out.println(yemek.stream().noneMatch(t -> t.startsWith("w")) ? "w ile baslayan hic yemek yok" : "w ile baslayan yemek var");
    }
/*
    8. Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

 */

    public static void xIleBitenElKontrol(List<String> yemek) {
        System.out.println(yemek.
                stream().
                anyMatch(t -> t.endsWith("x")) ? "agam senden bir  cacix olmaz  ?" :
                "agam senin aradigin yemek bu torpaklarda yooogggg");

    }
    /*
     9. Task : Karakter sayisi en buyuk elemani yazdiriniz.
     */
public static void charSayisiBuyukElYazdir(List<String>yemek){
    System.out.println(yemek.
            stream().
            sorted(Comparator.
                    comparing(t -> t.toString().length()).
                    reversed()).
            findFirst());
    System.out.println(yemek.
            stream().
            sorted(Comparator.
                    comparing(t -> t.toString().length()).
                    reversed()).
            limit(3));
    Optional<String> enBykKarakterliElem = yemek.
            stream().
            sorted(Comparator.
                    comparing(t -> t.toString().length()).
                    reversed()).
            findFirst();
}
/*
    10. Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

 */
    public static void ilkElHarcSonHrfSiraliPrint(List<String>yemek){
        yemek.stream().sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).skip(1).forEach(t-> System.out.print(t+ " "));
    }




}
