package studentPractice;

import java.util.Scanner;

public class studentpractice3_2 {

    // Kullanicidan alinan stringi tersten yazdiran bir method create ediniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen string bir ifade giriniz:  ");
        String str = scan.nextLine();

        tersineCevirYazdir(str);

    }//main method

    private static void tersineCevirYazdir(String str) {
        String tersHali = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersHali += str.charAt(i);
        }
        System.out.println(tersHali);
    }

}
