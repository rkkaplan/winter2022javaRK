package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        // girilen bir karakterin, harf olup olmadigini bulalim

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter= scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z')  ||  (karakter>='a' && karakter<='z')){

            System.out.println("Girdiginiz Karakter Bir Harf");

        } else {
            System.out.println("Girdiginiz Karakter Harf Degil" );

        }


    }
}
