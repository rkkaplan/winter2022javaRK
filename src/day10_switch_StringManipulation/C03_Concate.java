package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "candir";


        // Java canidr yazdiralim

        System.out.println(str1+ " " + str2);

        String cumle= str1.concat(str2);  //JavaCandir

        cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);
    }
}
