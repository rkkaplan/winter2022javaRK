package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        //verilen bir arrayi listeye cevirin


        String arr[]= {"A","B", "C"};
        List<String> arraydenList=Arrays.asList(arr);
        //arrayden list e cevirdigimiz zaman yeni list in
        //uzunlugunu degistiremeyiz. dolayisiyla yeni list ile add(), remove(),
        //clear() gibi methodlar calistirmak istedigimzde exception olusur

        //arraydenList.add("J");// UnsupportedOperationException
        System.out.println("19.satirda list: " + arraydenList);

        arr[1]="F";


        System.out.println("23.satirda Array: " + Arrays.toString(arr));
        System.out.println("24.satirda Array: " + arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("28.satirda Array: " + Arrays.toString(arr));
        System.out.println("29.satirda Array: " + arraydenList);


    }
}

