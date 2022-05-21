package replit_codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENGForwhile3 {

    //Write a code that returns the duplicate chars in a String array.(interview Question)
    //Input : String str=“Javaisalsoeasy”
    //Output: [a, s]
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */
        String str="Javaisalsoeasy";
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

       ArrayList<String> output=new ArrayList<>();
       for (int i = 0; i <arr.length ; i++) {
           for (int j = i+1; j <arr.length ; j++) {
               if (arr[i].contains(arr[j]) && !output.contains(arr[i])){
                   output.add(arr[i]);
               }
           }
       }
       System.out.println("Output: "+output);
    }
}
