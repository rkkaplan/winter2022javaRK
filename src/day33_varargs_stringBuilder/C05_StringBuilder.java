package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("ali can");

        String str = "Ali Can";

        System.out.println(sb1.compareTo(sb2)); // -32 //Compare iki sb'i esit mi diye ontrol etmek icin
                                                        // ilk harften baslayarak tum karakterleri karsilastirir
                                                        //ayni olan karakterler icin bir sey yazdirmaz
                                                        // farkli olan ilk karakter icin ascii tablosuna gore
                                                        // kac deger geride veya ileride oldugunu yazdirir
                                                            //Karakterler tamamen ayni ise bize 0 dondurur..

        // bir sb ile bir String'i compare edersek...Java CTE verir
       // System.out.println(sb1.compareTo(str)); str oldugu yere StringBuilder ister...



    }
}
