package replit_codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ENGForwhile2 {
    /*
    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("iki int giriniz, 1.si: ");
        int sayi1=scan.nextInt();
        System.out.println("iki int giriniz, 2.si; ");
        int sayi2=scan.nextInt();
        int min=0;
        int ebob=0;

        if (sayi1<sayi2) {
            min = sayi1;
        } else if(sayi1>sayi2) {
            min = sayi2;
        }
        for (int i = min; i >0 ; i--) {
            if ((sayi1%i ==0) &&  (sayi2%i ==0)){
                ebob = i;
                break;
            }

        }
        System.out.println("ebob = " + ebob);
        int ekok = (sayi1*sayi2)/ebob;
        System.out.println("ekok = " + ekok);


        // Scanner scan = new Scanner(System.in);
       // int first, second,gcd=0 ;
       // System.out.println("Please enter first and second integer: ");
       // first = scan.nextInt();
       // second = scan.nextInt();
       // int min = (first< second) ? first : second;
       // for (int i = min; i >0 ; i--) {
       //     if ((first%i == 0) && (second % i == 0)){
       //         gcd = i;
       //         break;
       //     }
//
       // } int lcm = (first*second)/gcd;
       // System.out.println("GCD of first and second: " + gcd);
       // System.out.println("LCM of first and second: " + lcm);






    } //main method
}
