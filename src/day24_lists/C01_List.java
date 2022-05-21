package day24_lists;

import day23_multiDimensionArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {
        int arr[]={};

        //bu arraye 5 ekleyelim
        arr=C06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));

        //bir de 3 ekleyelim

        arr = C06_Arrays.arrayeElemanEkle(arr,3);
        System.out.println(Arrays.toString(arr));

        //bir list olusturalim

        List <Integer> sayilarList=new ArrayList<>();
        System.out.println(sayilarList);// []
        sayilarList.add(5);// [5]
        sayilarList.add(3); // [5,3]
        sayilarList.add(0,7); // [3,5,7]
        sayilarList.add(2,7); // [7,5,7,3]
        System.out.println(sayilarList);
    }
}
