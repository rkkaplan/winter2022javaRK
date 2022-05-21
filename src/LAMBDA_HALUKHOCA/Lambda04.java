package LAMBDA_HALUKHOCA;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {
     /*
    TASK :
    fields --> Universite (String)
               bolum (String)
               ogrcSayisi (int)
               notOrt (int)
               olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
     */
     public static void main(String[] args) {

         Universite bogazici = new Universite("bogazici", "matematik", 571, 93);
         Universite itu = new Universite("istanbul teknik", "matematik", 622, 81);
         Universite istanbul = new Universite("istanbul", "hukuk", 1453, 71);
         Universite marmara = new Universite("marmara", "bilgisayar muh", 1071, 77);
         Universite ytu = new Universite("yildiz teknik", "gemi", 333, 74);

         List<Universite> unv = new ArrayList<>(Arrays.asList(bogazici,itu,istanbul,marmara,ytu));

         System.out.println(notOrt74BykUnv(unv));
         System.out.println("\n     ****    ");
         System.out.println(ogrSayisi110AzMi(unv));
         System.out.println("\n     ****    ");
         System.out.println(matBolumVarMi(unv));
         System.out.println("\n     ****    ");
         System.out.println("ogrSayiBkSirala(unv) = \n" + ogrSayiBkSirala(unv));
         System.out.println("\n     ****    ");
         notOrtBuyKucSirala(unv);
         System.out.println("\n     ****    ");
         System.out.println("ogrSayisi2nciyiYazdir(unv) = " + ogrSayisi2nciyiYazdir(unv));
         System.out.println("ort63byklerinOgrToplaYazdir(unv) = " + ort63byklerinOgrToplaYazdir(unv));
         System.out.println("\n     ****    ");
         System.out.println("ort63byklerinOgrToplaYazdirToInt(unv) = " + ort63byklerinOgrToplaYazdirToInt(unv));
         System.out.println("\n     ****    ");
         System.out.println("ogrSay333BykNotOrtOrtAl(unv) = " + ogrSay333BykNotOrtOrtAl(unv));
         System.out.println("\n     ****    ");
         System.out.println("mathBolumSayisi(unv) = " + mathBolumSayisi(unv));
         System.out.println("\n     ****    ");
         System.out.println("ogrSay571BykMaxNotOrtOrt(unv) = " + ogrSay571BykMaxNotOrtOrt(unv));
         System.out.println("\n     ****    ");
         System.out.println("ogrSayisi1071AzMinNotOrt(unv) = " + ogrSayisi1071AzMinNotOrt(unv));
         System.out.println("\n     ****    ");


     }//main method


    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notOrt74BykUnv(List<Universite>unv){

   return unv.
           stream().
           allMatch(t->t.getNotOrt()>74);
    }


    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean ogrSayisi110AzMi(List<Universite>unv){
        return unv.
                stream().
                allMatch(t->t.getOgrcSayisi()>110);

    }


    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean matBolumVarMi(List<Universite>unv){
         return unv.stream().anyMatch(t->t.getBolum().contains("mat"));
    }


    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.

    public static List<Universite> ogrSayiBkSirala(List<Universite>unv){
      return  unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).collect(Collectors.toList());
    }


    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static void notOrtBuyKucSirala(List<Universite> unv){
        System.out.println(unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).collect(Collectors.toList()));

    }


    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static List<Universite> ogrSayisi2nciyiYazdir(List<Universite>unv){

        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1).collect(Collectors.toList());
    }


    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.

    public static int ort63byklerinOgrToplaYazdir(List<Universite>unv){
         return unv.stream().filter(t->t.getNotOrt() > 63).map(t->t.getOgrcSayisi()).
                // reduce(Integer::sum);  //return type: Optional<Integer> olmali
                //reduce(Math::addExact);   //return type: Optional<Integer> olmali
                reduce(0, (t,u) -> t+u );
    }
    public static int ort63byklerinOgrToplaYazdirToInt(List<Universite>unv){
        return unv.stream().
                filter(t->t.getNotOrt() > 63).
                mapToInt(t->t.getOgrcSayisi()).
                sum();

    }


    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static OptionalDouble ogrSay333BykNotOrtOrtAl(List<Universite>unv){
         return unv.stream().
                 filter(t->t.getOgrcSayisi()>333).
                 mapToDouble(t->t.getNotOrt()).
                 average();// akisdaki elemanlarin ortalamasi alindi

    }


    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
public static int mathBolumSayisi(List<Universite>unv){
         return (int) unv.stream().filter(t->t.getBolum().contains("mat")).count();
}

    //task 10-->Ogrenci sayilari 571'den fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static OptionalInt ogrSay571BykMaxNotOrtOrt(List<Universite>unv){
         return unv.stream().filter(t->t.getOgrcSayisi()>571).mapToInt(t->t.getNotOrt()).max();
    }


    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
public static OptionalDouble ogrSayisi1071AzMinNotOrt(List<Universite>unv){
         return unv.stream().filter(t->t.getOgrcSayisi()<1071).mapToDouble(t->t.getNotOrt()).min();
}


}
