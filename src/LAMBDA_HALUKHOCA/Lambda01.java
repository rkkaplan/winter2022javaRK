package LAMBDA_HALUKHOCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    /*
   1) Lambda "Functional Programming"-->method(action) kullanma pr dili.
      Lambda --> method create  etme değil mevcut method'ları(library)secip kullanmaktır...
      Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
      Lambda'lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
      Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
       ve hatasiz code yazma acilarindan cok faydalidir.
   4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
      Lambda kullanmak hatasız code kullanmaktır.

          Collections Nedir?
          Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
          yapar. Array'ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
          yaptığı gibi, daha fazlasını da yapar.
          Java'da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
          topluluğu bir arada tutan bir yapıdır. 'Collections Framework' ise arayüzler ve onların kurgularından
          (implementations) oluşur.
*/
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        printElStructured(sayi); // 34 22 16 11 35 20 63 21 65 44 66 64 81 38 15
        System.out.println("\n\t\t\t\t   ***");
        printElFunctional(sayi);// 34 22 16 11 35 20 63 21 65 44 66 64 81 38 15

        System.out.println("\n\t\t\t\t   ***");
        printElFunctional1(sayi); // 342216113520632165446664813815
        System.out.println("\n\t\t\t\t   ***");
        printElFunctional2(sayi); // 34 22 16 11 35 20 63 21 65 44 66 64 81 38 15    //kendimiz yazdir() adi altinda print etme methodu
        // create edip call ettik
        System.out.println("\n\t\t\t\t   ***");
        printCiftElemanStructured(sayi); // 34 22 16 20 44 66 64 38
        System.out.println("\n\t\t\t\t   ***");
        printCiftElemanFunctional(sayi);
        System.out.println("\n\t\t\t\t   ***");
        printCiftElemanFunctional1(sayi);
        System.out.println("\n\t\t\t\t   ***");
        printCiftOtzKckFunctional(sayi);
        System.out.println("\n\t\t\t\t   ***");
        printCiftVeyaOtzBykFunctional(sayi);


    }

    //Task : Structured Programming kullanarak list elemanlarını ayni satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printElStructured(List<Integer> sayi) {
        for (Integer w : sayi
        ) {
            System.out.print(w + " ");

        }

    }

    //Task : FUNCIONAL Programming kullanarak list elemanlarını aralarında bosluk olacak sekilde print ediniz.
    public static void printElFunctional(List<Integer> sayi) {
        sayi.stream().forEach(t -> System.out.print(t + " "));


    }

    /*
stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
forEach() :datanin parametresine gore her bir elemanı isler
t-> : Lambda operatoru
Lambda Expression-->(parameter list) -> {action body}
  Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
  -> Arrow-token: Argüman listesi ile expression gövdesini birbirine bağlamak için kullanılır.
  Body: Expressionları ve statementları içerir.

 Bir kod bloğundan oluşan bir body...
 Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
 Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

     () -> {
      double pi = 3.1415;
         return pi;
     };
Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

*/
    public static void printElFunctional1(List<Integer> sayi) {
        sayi.stream().forEach(System.out::print);

    }

    public static void yazdir(int a) { // verilen int degeri ayni satirda bosluk birakarak yazdirma action'i yapan seed (tohum)
        System.out.print(a + " ");

    }

    public static void printElFunctional2(List<Integer> sayi) {
        sayi.stream().forEach(Lambda01::yazdir); //method reference--> System.out yapisinda print methodu refere et..
        // Lambda01 classindan yazdir methodu cagirdik

    }

    //TASK:  structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz
    //Once amele stille yapalim
    public static void printCiftElemanStructured(List<Integer> sayi) {
        for (Integer w : sayi
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }

    }

    //TASK:    functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz
    public static void printCiftElemanFunctional(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0).forEach(Lambda01::yazdir);

    }

    public static boolean ciftBul(int a) { //seed (tohum) method, kendisine verilen int degerin cift olmasini kontrol eder

        return a % 2 == 0;
    }

    public static void printCiftElemanFunctional1(List<Integer> sayi) {
        sayi.  //fonksiyonlari bir alt satira gecirmek yazilim gelenegidir
                stream().// burda list elemanlari akisa alindi
                filter(Lambda01::ciftBul). //ciftbulmethod refere edilerek akistaki elemanlar filtrelendi (cift sayiya)

                forEach(Lambda01::yazdir); //filtreden gelen elemanlar yazdir () method refere edilerek print edildi
    }
    //Task : functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void printCiftOtzKckFunctional(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0 && t < 34).
                filter(t -> t < 34).
                forEach(Lambda01::yazdir);

    }
    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftVeyaOtzBykFunctional(List<Integer> sayi){
        sayi.stream().filter(t-> t>34 || t%2==0).forEach(Lambda01::yazdir);
    }
}





