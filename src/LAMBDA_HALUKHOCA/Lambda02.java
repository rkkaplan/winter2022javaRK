package LAMBDA_HALUKHOCA;

import java.util.*;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));

        ciftKarePrint(sayi);
        System.out.println("\n     *****     ");
        tekKupBirFazlaPrint(sayi);
        System.out.println("\n     *****     ");
        ciftKareKokprint(sayi);
        System.out.println("\n     *****     ");
        maxElemanBul(sayi);
        System.out.println("\n     *****     ");
        ciftKareMaxBul(sayi);
        System.out.println("\n     *****     ");
        tumElemanTopla(sayi);
        System.out.println("\n     *****     ");
        tumElemanCarp(sayi);
        System.out.println("\n     *****     ");
        minBul(sayi);
        System.out.println("\n     *****     ");
        bestenBuyukEnKucuk(sayi);
        System.out.println("\n     *****     ");
        ciftKareKucuktenBuyuge(sayi);
        System.out.println("\n     *****     ");
        tekKareBuyuktenKucuge(sayi);





    }//main

    // Task: Functional Programing ile listin cift elemanlarinin karelerini ayni satirda aralarinda bosluk birakarak print ediniz.
    public static void ciftKarePrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).//map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
                forEach(Lambda01::yazdir);


    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edin
    public static void tekKupBirFazlaPrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 != 0).//tek elemanlar filtrelendi
                map(t -> (t * t * t) + 1). //tek elemanlarinin kuplerinin 1 fazlasi UPDATE edildi
                forEach(Lambda01::yazdir);
    }
    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKareKokprint(List<Integer>sayi){
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(Math::sqrt).   //method refere edildi
                forEach(t-> System.out.print(t+ " "));

    }
    // Task : list'in en buyuk elemanini yazdiriniz

    public static void maxElemanBul(List<Integer>sayi){
       Optional<Integer> maxSayi =   //esitiliğin sol tarafi int maxSayi olamadi...:Optional olmak zorunda oldu!!!
               sayi.
               stream().
               reduce(Math::max)  ; //REDUCE: akisa giren elemanlari ACTION sonrasi tek(yalniz, bir) eleman haline getirir.
                                    // reduce'dan sonra islem olmaz. terminal islemdir
        /*
         reduce()-->azaltmak ...
        ---bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        ---kullanımı yaygındır pratiktir.
        ---Bir Stream içerisindeki verilerin teker teker işlenmesidir.
        ---Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuzc bir sonraki adıma girdi olarak sunulmaktadır.
        Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        ---reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        ---reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        ---İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
         */


        System.out.println(maxSayi);  //Optional[15]
        System.out.println("Halukca: " + sayi.stream().reduce(Math::max) );  //Halukca: Optional[15]

    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
public static void ciftKareMaxBul(List<Integer> sayi) {
    System.out.println(
            sayi.
            stream().
            filter(Lambda01::ciftBul).
            map(t -> t * t).
            reduce(Math::max)); //reduce(Integer::max) de ayni islemi yapar.specifictir. specific class daha hizli run olur!!!
}
    // Task : List'teki tum elemanlarin toplamini yazdiriniz.

public static void  tumElemanTopla(List<Integer> sayi){
        /*
    1.YOL: LAMBDA EXPRESSION
     */

        int toplam = sayi.stream().reduce(0, (a,b)-> a+b); // baslangic degerini sifir0 atadigimizdan dolayi
                                                                    // null olmayacagi icin OPTIONAL  zorunlu olmadi
        /*
        a ilk degerini her zaman atanan degerden (identity) alır
        b degerini her zamana  stream()'dan akısdan alır
        a ilk degerinden sonraki her değeri action(işlem)'dan alır
        */
    /*
    2.YOL: METHOD REFERENCE:
     */
        Optional<Integer> topla =sayi.stream().reduce(Integer::sum);  // OPTIONAL olmasi gerekiyor cunku liste bos olabilir null olabilir

    System.out.println("LAMBDA EXPRESSION ile: " + toplam);
    System.out.println("Method REFERENCE ile: " + topla);
}
    // Task : List'teki cift elemanlarin carpimini  yazdiriniz:

public static void tumElemanCarp(List<Integer> sayi){
        //Method Reference ile
    System.out.println(("Method REFERENCE ile: " + sayi.stream().filter(Lambda01::ciftBul).reduce(Math::multiplyExact)));
    //Lambda Expression ile
    System.out.println("LAMBDA EXPRESSION ile: " + sayi.stream().filter(Lambda01::ciftBul).reduce(1, (a, b) -> (a * b)));
}

    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
    //1. yontem Method Reference --> Integer class
    //2. yontem Method Reference --> Math class
    //3. yontem Lambda Expression
    //4. yontem Method Reference --> Haluk class
    public static void minBul(List<Integer> sayi){
        //1. yontem Method Reference --> Integer class
        Optional<Integer> minSayiInteger = sayi.stream().reduce(Integer::min);
        System.out.println(minSayiInteger);
        //2. yontem Method Reference --> Math class
        Optional<Integer> minSayiMath = sayi.stream().reduce(Math::min);
        System.out.println(minSayiInteger);
        //3. yontem Lambda Expression
        int minSayiLambda = sayi.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
        System.out.println(minSayiInteger);
        //4. yontem Method Reference --> Haluk class
         Optional<Integer> minSayiHaluk = sayi.stream().reduce(Lambda02::byHalukMin);
        System.out.println(minSayiInteger);




    }
    public static int byHalukMin(int a, int b){ //bu method iki int degerin en kucugunu verir
        return a<b ? a : b;
    }
    // Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
public static void bestenBuyukEnKucuk(List<Integer> sayi){
    System.out.println(sayi.stream().filter(t -> t > 5 && t % 2 == 1).reduce(Lambda02::byHalukMin));
}

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
public static void ciftKareKucuktenBuyuge(List<Integer> sayi){
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t->t*t). //filtrelenen cift sayi nin karesi alindi
                sorted().  //karesi alinan elemanlar Natural Order - kucukten buyuge siralandi
                forEach(Lambda01::yazdir);
    //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
    //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.




}
    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void tekKareBuyuktenKucuge(List<Integer> sayi){
sayi.stream().filter(t-> t%2!=0).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(Lambda01::yazdir);
    }





}
