package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz

        char ilkHarf = 'c';
        char sonHarf = 's';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print( i + " "); //c d e f g h i j k l m n o p q r s

        }

        double baslangic=10;
        double bitis=20;
        double artis= 0.2;
        // baslangic ve bitis sayilari arasinda artis miktari ile olusacak
        // tum sayilari yazdirin

        for ( double i= baslangic; i <=bitis ; i+=artis) {
            System.out.print(i + " ");

        }






    }
}
