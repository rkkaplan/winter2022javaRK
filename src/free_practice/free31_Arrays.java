package free_practice;

import java.util.Arrays;

public class free31_Arrays {
    public static void main(String[] args) {
        /*
        Soru 1:
Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu
array’i yazdirin.
         */
        // String arr[] = new String[4];
        // arr[0] = "Ali";
        // System.out.println(Arrays.toString(arr));
        // int myArray[ ] = {9, 10,11};
        // int size =myArray.length;
        // for (int i = 0; i <size ; i++) {
        //     System.out.print(myArray[i]);

        // }
        // System.out.println(Arrays.toString(myArray));

        /*
        Soru 1:
Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir
program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
         */
        //   int arr[] = {1,2,3,4,5};
        //   int sumOfArr=0;
        //   for (int i = 0; i <arr.length ; i++) {
        //       sumOfArr+=arr[i];

        //   }
        //   System.out.println("sumOfArr = " + sumOfArr);
        /*
        Soru 1 )
Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
yazdiran bir method yaziniz. { { 1,2,3}, {4,5,6}}
         */
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        int prod = 1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                prod*=arr[i][j];


            }



        }
        System.out.println(prod);

    }
}
