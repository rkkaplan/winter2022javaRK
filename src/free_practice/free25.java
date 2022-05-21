package free_practice;

import java.util.Scanner;

public class free25 {
    //Soru3 Kullanicidan isim isteyin Eger
    // isim "a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
    // isim "Z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
    // ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();
        if (name.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");

        }else if (name.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");

        }else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");

        }
    }
}
