package free_practice;

import java.util.Scanner;

public class free23 {
    //Kullanicidan bir cumle isteyin
    // Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
    // "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak
    //yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
    //yazdirin

    public static void main(String[] args) {
        String sentence = "gozlerim cami gibi agir agir acildi bu sabah";
        String firstWord = "buyuk";
        String secondWord = "kucuk";

        if (sentence.contains(firstWord)) {
            System.out.println(sentence.toUpperCase());
        }else if(sentence.contains(secondWord)) {
            System.out.println(sentence.toLowerCase());
        }else System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");

    }
}
