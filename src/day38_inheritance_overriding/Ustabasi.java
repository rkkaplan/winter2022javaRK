package day38_inheritance_overriding;

public class Ustabasi extends Isci {
    public String statu = "Ustabasi";
    public String haklar = "ustabasi haftada 1 gun ekstra tatil hakkina sahiptir";


    public void mesai() {
        System.out.println("ariza varsa Ustabasi ekstra ücret almadan calisir");
    }

    public void maasHesapla() {
        System.out.println("Ustabasi 30 gun * 8 saat * 12 euro = " + (30 * 8 * 12) + "Euro maas alir");
    }

    public static void main(String[] args) {
        /*
        icinde oldugumuz class'tan klasik haliyle bir obje olusturusak
        o obje ile cagirdigimiz variable ve methodlarda Java once icinde bulundugumuz class'a bakar.
        aradigimiz class uyesi , icinde oldugumuz class'da varsa  bize onu getirir
        YOKSA
        parent class(lar)a bakar, ilk buldugunu getirir.
         */
        Ustabasi yasin = new Ustabasi();
        System.out.println(yasin.statu); // ustabasi
        System.out.println(yasin.haklar); // ustabasi haftada 1 gun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye); // isciler yilda bir ikramiye alir
        System.out.println(yasin.izin); // Tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesapla();
        yasin.mesai();
        /*
        eğer isci olarak ozelliklerini gormek istersek
        Class adini (Data Turu) Isci seceriz
         */
        Isci ahmet = new Ustabasi();
        System.out.println(ahmet.statu); // Isci
        System.out.println(ahmet.haklar); // Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye); // isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin); // Tum personel yilda 4 hafta izin kullanabilir
        ahmet.maasHesapla();
        ahmet.mesai();

        /*
        Siz bir objeyi hangi class'tan tanimlarsaniz  class'a ait ozelliklere sahip olur
         */

        Personel adem = new Ustabasi();
        System.out.println(adem.statu); // Personel
        System.out.println(adem.haklar); // tum personel esit haklara sahiptir
        // System.out.println(adem.ikramiye); // CTE verir
        System.out.println(adem.izin); // Tum personel yilda 4 hafta izin kullanabilir
        adem.maasHesapla();
        adem.mesai();




        /*
           Personel adem = new Ustabasi(); bu bir ustabasi objesidir
           Personel adem = new Personel(); bu bir personel objesidir

         */


        /*
        Personel adem = new Ustabasi();

        ademin data turu personel'dir. boylece biz ademi'i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'in ustabasi oldugunu biliyorum
        cunku constructor'i ustabasi
        ama bu olusturma formati ile adem'in tum personelle birlikte
        sahip oldugu ortak ozellikleri vurgulamak istiyorum

        bu kullanim seklinde olusturulan obje data turu olarak secilen class ve onun
        parent classlarindaki variable'lari kullanabilir.

         */








    }
}
