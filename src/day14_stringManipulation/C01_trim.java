package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        String str="  Siz ne derseniz diyin Java bildigini okur  ";
        str.trim();
        System.out.println(str); //atama yapilmadigi icin str'ye trim manipulasyonu kalici olmadi
        System.out.println(str.length());


        str =str.trim(); // atama yapildi
        System.out.println(str);
        System.out.println(str.length());


    }
}
