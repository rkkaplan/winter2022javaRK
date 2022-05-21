package free_practice;

import java.util.Scanner;

public class free20 {

    // Soru 1) Kullanicidan bir cumle ve bir harf isteyin,
    //          harfin cumlede var olup olmadigini yazdirin


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin: ");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir harf girin: ");
        String harf = scan.nextLine();
        System.out.println( cumle.contains(harf));

    }
}
