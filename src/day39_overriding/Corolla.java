package day39_overriding;

public class Corolla extends Toyota {

    protected String hiz = "Corolla max 200 km hiz yapar";
    protected String yakit = "corolla benzinli veya elektriklidir";
    protected String model = "Corolla";


    public void motor() {
        System.out.println("Corolla araclar cevreci motor kullanir");
    }

    public void yakitTuketimi() {
        System.out.println("Corolla 5.6 lt takit tuketir");
    }

    public void vitesSayisi() {
        System.out.println("Corolla 5 viteslidr");
    }

    public static void main(String[] args) {
        /*
        Data turu ve constructor farkli oldugunda
        constructor calistigi icin obje constructor'in
        oldugu clas ozelliklerini tasir. ancak data turu Parent class secildigi
        icin cariable'lar data turunun secildigi class ve onun parent clas'larindan
        deger alabilir

        Methodlar icin ise yine Data turunun oldugu class a gideriz
        ancak direk method'u calistirmadan once method override
        edilmis mi diye kontrol ederiz.


         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); //araba classindan alir
        System.out.println(arb1.hiz); //Corolladan alir
        System.out.println(arb1.yakit); // Corolladan alir
        System.out.println(arb1.marka); // Toyota dan alir
        System.out.println(arb1.sirketMerkezi); // Toyota'dan alir
        System.out.println(arb1.model); // Corolla class'indan alir
        arb1.motor(); //corolla

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); //araba classindan alir
        System.out.println(arb2.hiz); //Toyota dan alir
        System.out.println(arb2.yakit); // araba dan alir
        System.out.println(arb2.marka); // Toyota dan alir
        System.out.println(arb2.sirketMerkezi); // Toyota dan alir
        // System.out.println(arb2.model); // CTE
        arb2.motor(); //

        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); //araba classindan alir
        System.out.println(arb3.hiz); //araba dan alir
        System.out.println(arb3.yakit); // araba dan alir
        System.out.println(arb3.marka); // araba dan alir
        // System.out.println(arb3.sirketMerkezi); // CTE
        //System.out.println(arb3.model); // CTE

    } //main method
}
