package free_practice;

public class free32_multiDimensionalArrays {
    public static void main(String[] args) {
        /*
        Soru 2)
Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
ekrana yazdiran bir program yaziniz {{1,2,3}, {4,5}, {6}}
         */

    //   int arr[][] = {{1, 2, 3}, {4, 5}, {6}, {9, 6, 4, 10}};
    //   int result = 1;

    //   for (int i = 0; i < arr.length; i++) {
    //       for (int j = 0; j < 1; j++) {
    //           result *= arr[i][arr[i].length - 1];


    //       }

    //   }
    //    System.out.println("result = " + result);
        /*
        Soru 3)
Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
arr1 = {{1,2},   {3,4,5}, {6} } ve
arr2 = {{7,8,9}, {10,11}, {12}}
         */
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int minLength=0;
        if (arr1.length>= arr2.length){
            minLength= arr2.length;
        }else minLength= arr1.length;

        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println(arr1[i][j] + arr2[i][j] );

            }

        }


    }//main method
}
