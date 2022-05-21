package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayan bir method olusturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 50;
        int sayi5 = 60;

        // bir de 3 sayiyi toplayan method olusturun

        toplaGel(sayi1, sayi2);
        toplaGel(sayi1, sayi2, sayi3);
        toplaGel(sayi1, sayi2, sayi3, sayi4, sayi5);

    }

    private static void toplaGel(int... sayi) {
        int toplam = 0;
        for (int each:sayi
             ) { toplam+=each;

        }
        System.out.print(toplam);
    }


}
