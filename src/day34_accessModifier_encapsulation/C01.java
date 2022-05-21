package day34_accessModifier_encapsulation;

public class C01 {
    private static int sayi = 10;
    private static String str = "Java";
    static int acikSayi = 20; //access modifier i default access modifier dir.
    String acikString = "Hi"; //access modifier i default access modifier dir.
    public static int halkaAcikSayi = 15;
    protected static int aileyeOzel = 40;
    protected C01(){
        //bu constructor in access modifier i
        //default access modifier dir. dolayisiyla icinde oldugumuz
        //paketin disinda bu classdan obje olusturulamaz

    }

     private C01(int numara){
        System.out.println("parametreli constructor calisti");

    }
    private void  method1() {

    }


}
