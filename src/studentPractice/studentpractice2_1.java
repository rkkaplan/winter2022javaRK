package studentPractice;

public class studentpractice2_1 {
    public static void main(String[] args) {
        // Kullanıcıdan bir cumle al
        //      1- "Y" ile veya "y" ile biten kelimeleri yazır
        //      2- codu case insensitive yap


        String input = "Ey Edip Bey! Adana'da pide ye!";
        input = input.replaceAll("\\p{Punct}","");
        input = input.toLowerCase();

        String arr [] = input.split(" ");

        String x = "";
        System.out.print("\"Y\" ile veya \"y\" ile biten kelimeler: ");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].endsWith("y")){
                x+= arr[i] + " ";
            }

        }
        System.out.println(x + " ");





    }
}
