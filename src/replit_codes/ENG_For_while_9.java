package replit_codes;

public class ENG_For_while_9 {
    /*
Write a java program to reverse the number which user entered.

Input :1238
Output :Reverse Of The Number: 8321
     */
    public static void main(String[] args) {
        String input = "1238";
        System.out.print("Reverse Of The Number: ");
        for(int i = input.length(); i>0 ; i--){
            System.out.print(input.charAt(i-1));
        }

    }
}
