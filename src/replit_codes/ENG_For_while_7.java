package replit_codes;

public class ENG_For_while_7 {
    /*
    Write java code checking the number is Perfect number or not.

Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number
     */
    public static void main(String[] args) {
        int input = 7;
        int output = 0;
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                output += i;
            }

        }
        if (input == output) {
            System.out.println("Input :" + input + " Output:" + output + " is Perfect Number");
        } else System.out.println("Input :" + input + " Output:" + output + " is not Perfect Number");

    }//main
}
