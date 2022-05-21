package day23_multiDimensionArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        //kullaniciya kac elementlik bir array olusturacagini sorun
        //arrayi olusturup elementlreri kullanicidan alip, array e atayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istediginizi yazin");

        int uzunluk= scanner.nextInt();

        int arr[] = new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin  " + (i+1) + ". elemani giriniz");
            arr[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
