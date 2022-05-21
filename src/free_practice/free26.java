package free_practice;

import java.util.Scanner;

public class free26 {
    // Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter a surname: ");
        String surName = scanner.nextLine();
        if (name.length() < surName.length()) {
            System.out.println(surName + ", " + name + "'den daha uzundur");
        } else if (surName.length()< name.length()){
            System.out.println(name + ", " + surName + "'den daha uzundur");

        }
    }
}
