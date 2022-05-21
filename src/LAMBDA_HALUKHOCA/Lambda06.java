package LAMBDA_HALUKHOCA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda06 {
    public static void main(String[] args) throws IOException {
        //TASK 01 --> ridvan.txt dosyasini okuyunuz.(Console'a print ediniz.)
        System.out.println("\nTASK 01 --> haluk.txt dosyasini okuyunuz -->  ");
        Path ridvan = Path.of("src/LAMBDA/ridvan.txt");//path haluk obj atandi
        Stream<String> akıs = Files.lines(ridvan);//ridvan.txt dataları akıs stream'e atandı

        //1.Yol:
        Files.lines(ridvan).forEach(System.out::println);
        //2.Yol:
        akıs.forEach(System.out::println);


        //TASK 02 --> ridvan.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("\nTASK 02 --> ridvan.txt dosyasini buyuk harflerle okuyunuz -->  ");
        Files.lines(Paths.get("src/LAMBDA/ridvan.txt")).map(String::toUpperCase).forEach(System.out::println);

        //TASK 03 --> ridvan.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("\nTASK 03 --> ridvan.txt dosyasindaki ilk satiri kucuk harflerle print ediniz.. -->  ");

        //1.Yol: limit() methoduyla
        Files.lines(ridvan).map(String::toLowerCase).limit(1).forEach(System.out::println);
        //2.Yol:findFirst():
        System.out.println(Files.lines(ridvan).map(String::toLowerCase).findFirst());


        //TASK 04 --> ridvan.txt dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\nTASK 04 --> ridvan.txt dosyasinda basari kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
        System.out.println(Files.lines(ridvan).map(String::toLowerCase).filter(t -> t.contains("basari")).count());


        //TASK 05 --> ridvan.txt dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("\nTASK 05 --> ridvan.txt dosyasindaki farkli kelimeleri  yazdiriniz. -->  ");
        /*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.
   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.
   */
        //1.Yol distinct ile
        System.out.println(Files.lines(ridvan).map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));

        //2.Yol toSet ile  (cunku toSet methodu benzersiz olanlari liste yapar oyuzden distincte gerek yok )
        System.out.println(Files.lines(ridvan).map(t -> t.split(" ")).flatMap(Arrays::stream).collect(Collectors.toSet()));

        //TASK 06 --> ridvan.txt dosyasindaki tum kelimeleri natural order  print ediniz..
        System.out.println("\nTASK 06 --> ridvan.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");

        Files.lines(ridvan).map(t -> t.split(" ")).flatMap(Arrays::stream).sorted().forEach(System.out::print);

        //TASK 07 --> ridvan.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println("\nTASK 07 --> ridvan.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");

        System.out.println(Files.lines(ridvan).
                map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.equals("basari")).
                count());

        //TASK 08 --> ridvan.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println("\nTASK 08 --> ridvan.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");
        System.out.println(Files.lines(ridvan).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("a")).count());

        //TASK 09 --> ridvan.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("\nTASK 09 --> ridvan.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");
        Files.lines(ridvan).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("a")).forEach(System.out::println);

        //TASK 10 --> ridvan.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println("\nTASK 10 --> ridvan.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");

        System.out.println(Files.lines(ridvan).map(t -> t.replaceAll("\\W", "").
                        replaceAll("\\d", "").
                        split("")).
                flatMap(Arrays::stream).distinct().count());


        //TASK 11 --> ridvan.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println("\nTASK 11 --> ridvan.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");

        System.out.println(Files.lines(ridvan).
                map(t -> t.replaceAll("[.!,:)\\-]", "").
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().
                count());

        //TASK 12 --> ridvan.txt dosyasinda  farkli kelimeleri print ediniz
        System.out.println("\nTASK 12 --> ridvan.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");

        Files.lines(ridvan).
                map(t -> t.replaceAll("[.!,:)\\-]", "").
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().forEach(System.out::println);


    }//main method

}
