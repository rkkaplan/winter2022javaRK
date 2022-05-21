package replit_codes;

public class ENGForwhile4 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts an integer as input and calculates factorial and prints like output.

Input : 6

Output: 6!=6*5*4*3*2*1=720
         */
        int num = 6;
        int output = 1;
        System.out.print(  "Output: " +  num+"!=");

        for (int i = num; i > 0; i--) {
            output *= i;

            if (i > 1) {
                System.out.print(i + "*");
            } else {
                System.out.print(i);
            }


        }
        System.out.print("="+output);

    }
}
