package replit_codes;

public class ENGForwhile5 {
    /*
    Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
     */
    public static void main(String[] args) {
        int num = 20;
        System.out.print("OUTPUT : Even Numbers from 100 to 0 are: ");
        for (int i = num; i >= 0; i-=2) {
            System.out.print(i + " ");
        }

    }

}
