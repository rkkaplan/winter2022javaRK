package replit_codes;

public class ENG_For_while_10 {
    /*
    Write a Program to find the sum of natural numbers from 1 to 100.

OUTPUT : Sum of Natural Numbers 5050
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;

        }
        System.out.println("Sum of Natural Numbers " + sum);

    }
}
