package studentPractice;

import java.util.ArrayList;
import java.util.List;

public class studentpractice3_1 {
    //parametre olarak 2 tamsayi diziyi kabul eden ve onu yazdiran bir method yazin
    // input1 = {0,1,2,3,4,5}     input2 = {6,7,8,9,10}
    // output = {0,1,2,3,4,5,6,7,8,9,10}




    public static void main(String[] args) {
        containeraAt();





    } //main method

    private static void containeraAt() {
        int [] arr1 = {0,1,2,3,4,5};
        int arr2 [] = {6,7,8,9,10};
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i <arr1.length ; i++) {
            output.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            output.add(arr2[i]);
        }
        System.out.println(output);
    }

}
