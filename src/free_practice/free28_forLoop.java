package free_practice;

import java.util.Scanner;

import static free_practice.Customer.scan;

public class free28_forLoop {
    public static void main(String[] args) {
        // /*
        // Soru 1 )
        // Ekrana 10 kez “Java guzeldir” yazdirin

        //  */
        // String str = "Java guzeldir";
        // for (int i = 1; i <11 ; i++) {
        //     System.out.println(i+ ")- " + str);

        // }
        /*
        Soru 2 )
       10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin
         */
        // int sayi = 10;
        // for (int i = 10; i <=30 ; i++) {
        //     System.out.print(sayi+", ");
        //     sayi++;

        /*
        Soru 3)
100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda
yazdirin
        */
        //  int sayi = 100;
        //  for(int i = 100 ; i>=50; i--){
        //      System.out.print(sayi + ", ");
        //      sayi--;
        //  }

        /*
        Soru 4)
Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
kati olan sayilari yazdirin.
         */
        // Scanner scan =new Scanner(System.in);
        // System.out.println("Lutfen 100’den kucuk bir tamsayi girin: ");
        // int num =scan.nextInt();
        // for (int i = 3; i <=num ; i+=3) {
        //     System.out.print(i+ ", " );
        // }
        //Soru 5)
        //Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar
        // 3’un veya 5”in kati olan sayilari yazdirin.
        // Scanner scan =new Scanner(System.in);
        // System.out.println("Lutfen 100’den kucuk bir tamsayi girin: ");
        // int num =scan.nextInt();
        // for (int i = 3; i <=num ; i++) {
        //     if (i%3==0 || i%5==0 || i%15==0){
        //         System.out.print(i + ", ");
        //     }
//
        // }
        /*
        Soru 6) Interview Question
Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
girilen sayiya kadar tum sayilari yazdirin. Ancak;
-
Sayi 3’un kati ise sayi yerine “Java” yazdirin.
-
Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
-
Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
         */
        // Scanner scan =new Scanner(System.in);
        // System.out.println("Lutfen 100’den kucuk bir tamsayi girin: ");
        // int num =scan.nextInt();
        // for (int i =1 ;i<=num ; i++ ){
        //     if (i%3==0 && i%5==0){
        //         System.out.print("Java Guzeldir ");
        //     }else if (i%5==0){
        //         System.out.print("Guzeldir ");
        //     }
        //     else if (i%3==0){
        //         System.out.print("Java ");
        //     }
        //     else System.out.print(i + " ");
        // }
        //Soru 7 ) Interview Question
        //Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
        // String str = "Fenerbahce";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     System.out.print(str.charAt(i));
        // }
        //Soru 8 ) Interview Question
        //Kullanicidan bir String isteyin ve Stringi tersine ceviren
        //bir method yazin.

        // terstenYazmaMethodu("madagaskar");

        /*
        Soru 10 )
Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
toplayip, sonucu yazdiran bir program yaziniz
         */
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Lutfen iki sayi giriniz. 1.sayi: ");
        // int num1 = scan.nextInt();
        // System.out.println("Lutfen iki sayi giriniz. 2.sayi: ");
        // int num2 = scan.nextInt();

        // int min=num1<num2 ? num1 : num2;
        // int max = num1<num2 ? num2 : num1;
        // int toplam = 0;
        // for(int i = min ; i<=max ; i++ ){
        //     toplam+=i;
        // }
        // System.out.println(toplam);
        /*
        Soru 11 ) Interview Question
Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
         */
        int num6 = 10;
        int faktoriyel = 1;
        for (int i = num6; i > 0; i--) {
            faktoriyel *= i;
        }
        System.out.println(num6 + "! = " + faktoriyel);


    }//main method

    // private static void terstenYazmaMethodu(String str) {
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         System.out.print(str.charAt(i));
    //      }
    //  }

    /*

     */

}
