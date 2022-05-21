package replit_codes;

public class ENG_Method_Array_3 {
    /*
    Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3

output : 8

Hint :
     Use Character.isDigit()
     Integer.valueOf()
     */
    public static void main(String[] args) {
        String str = "ade1r4d3";
        String arr[]= str.replaceAll("\\D", "").split("");
        int output=0;
        for (int i = 0; i <arr.length ; i++) {
            output+=Integer.valueOf(arr[i]);

        }
        System.out.println("output: " + output);



    }//main method

}
