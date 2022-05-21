package studentPractice;

import java.util.Arrays;

public class studentPracticeMuratKurucay {


    /*
    yukaridaki gibi verilen bir array'in her bir inner arrayindeki toplamlari farkli bir array'e
    atayan bir method create ediniz
     */
    public static void main(String[] args) {
        int[][] sayilar = {{2, 3, 5}, {3, 5}, {6, 7, 8, 9}, {10, 11, 12}};
        toplamlar(sayilar);


    }

    public static void toplamlar(int[][] sayilar) {
        int toplamlar[] = new int[sayilar.length];
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                toplamlar[i] = toplamlar[i] + sayilar[i][j];

            }

        }
        System.out.println(Arrays.toString(toplamlar));
    }
}
