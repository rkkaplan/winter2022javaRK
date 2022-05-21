package free_practice;

import java.util.Scanner;

public class borc {
    public static void main(String[] args) {
        System.out.println("lutfen borcunuzu giriniz: " );
        Scanner scan =new Scanner(System.in);
        int amount=scan.nextInt();
        for (int i = 1; i <4 ; i++) {
            amount-=amount*0.1;

        }
        System.out.println(amount);

    }
}
