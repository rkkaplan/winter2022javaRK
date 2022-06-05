package day04_dataCasting_Increment;

public class C04_IncrementDecrement {
    public static void main(String[] args) {

        int sayi =20;


        System.out.println(sayi+ 10);

        System.out.println(sayi); //atama yapmazsak sayıda yaptıgımız artırma ya da azaltma kalıcı olmaz
                                  //atama yaoılmadı sadece sayinin 10 fazlasi yazildi


        sayi=sayi+10;

        System.out.println(sayi);    // bu sefer 30 oldu cunku atama yapildi solda 15.satırda


        System.out.println(sayi=sayi+=10);


        System.out.println(sayi);


    }
}
