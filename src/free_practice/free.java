package free_practice;

import java.util.Arrays;
import java.util.Scanner;

public class free {
    public static void main(String[] args) {
        //int []nums = {1,3,4,2};
        //System.out.println("4" + nums[nums[1]]);//42
        //int a;
        //int sum = 0;
        //for ( a = 3; a >1 ; a/=a++) {
        //    sum=sum+a;
        //}
        //System.out.println(sum);

        // int x = 0;
        // int[]arr= {2,3,5};
        // arr[x]=++x;
        // arr[x]=++x;
        // System.out.println(arr[x]);

        //int a = (int) 10.5689;
        //System.out.println(a);

        // System.out.println(9f/4);

        // int[]Ar = {1,6,9,20};
        // int val = Ar[0], i = 1;
        // while(Ar.length>i) {
        //     val = Ar[i]>val ? Ar[i] : val;
        //     i++;
        // }
        // System.out.println(val);
        // int a =7;
        // int b =4;
        // int c =a%b;
        // System.out.println(a%c);

        // int arr[]=new int[3];
        // for (int i = 0; i < 3; i++) {
        //     arr[i]=i;
        // } un
        // int res = arr[0] + arr[2];
        // System.out.println(res);
        // //SORU:Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
        Scanner scan = new Scanner(System.in);
        // System.out.println("Lutfen 2 sayi giriniz. Ilk sayiyi gir: ");
        // int num1= scan.nextInt();
        // System.out.println("Lutfen ikinci sayiyi gir: ");
        // int num2= scan.nextInt();
        // int toplam= num1+num2;
        // System.out.println("TOPLAM:" + toplam);
        // int fark= num1-num2;
        // System.out.println("FARK:" + fark);
        // int carpim= num1*num2;
        // System.out.println("CARPIM:" + carpim);
        //Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip
        //yazdirin
        // System.out.println("karenin bir kenar uzunlugunu birim olarak gir: ");
        // int kenar= scan.nextInt();
        // int cevre=kenar*4;
        // int alan=kenar*kenar;
        // System.out.println("cevre = " + cevre);
        // System.out.println("alan = " + alan);

        // SORU: Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        //System.out.println("yaricap gir: ");
        //int yaricap = scan.nextInt();
        //double cevre = 2 * Math.PI * yaricap;
        //double alan = Math.PI * Math.pow(yaricap, 2);

        // SORU Kullanicidan ismini alip isminin bas harfini yazdirin.
        // System.out.println("isminizi giriniz: ");
        // String isim=scan.nextLine();
        // System.out.println(isim.substring(0, 1));
        // System.out.println(Arrays.toString(isim.split("")));
        // System.out.println(isim.split("")[0]);

        //SORU: byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin


        //int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
        // short sayi = 5;
        // byte sayi2 = (byte) sayi;
        // long sayi3=88;
        // byte sayi4=(byte)sayi3;
        // double num =15.5;
        // byte sayi5 =(byte)num;
        // System.out.println(sayi5);

        //double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        //yazdirin

        //double num =255.36;
        //int num2 =(int)num;
        //byte num3 =(byte)num2;
        //System.out.println("num = " + num);
        //System.out.println("num2 = " + num2);
        //System.out.println("num3 = " + num3);

        //Soru 6 )
        //int bir sayiyi double bir sayiya bolun ve sonucu yazdirin

        //int sayi = 5;
        //double num =86.5;
        //int bolum = (int) (num/sayi);
        //System.out.println("bolum = " + bolum);

        //SORU: Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdiri
         //System.out.println("Lutfen 4 basamakli bir sayi gir");
         //int sayi = scan.nextInt();
         //int birler = sayi % 10;
         //sayi = sayi / 10;
         //int onlar = sayi % 10;
         //sayi = sayi / 10;
         //int yuzler = sayi % 10;
         //sayi = sayi / 10;
         //int binler = sayi % 10;
         //System.out.println("toplam: " + (birler + onlar + yuzler + binler));
        //*********************for ile****************************
        //System.out.println("Lutfen basamak toplamini merak ettiginiz dort basamkli bir sayiyi girin: ");
        // int sayi = scan.nextInt();
        // int sum = 0;
        // for (int i = 0; i <4; i++) {
        //     int birler =sayi % 10;
        //     sum+=birler;
        //     sayi=sayi / 10;

        // }
        // System.out.println("toplam :" + sum );
        //************************ while ile ***********************************
        // System.out.println("Lutfen basamak toplamini merak ettiginiz bir sayiyi girin: ");
        // int sayi = scan.nextInt();
        // int sum = 0;
        // while (sayi>0){
        //     int birler = sayi%10;
        //     sum+=birler;
        //     sayi=sayi / 10;
        // }
        // System.out.println("toplam :" + sum );


        //SORU: 0 dan, girdiginiz sayiya kadar olan sayilar toplamini yazdirin
        // System.out.println("Lutfen sayi giriniz: ");
        // int sayi = scan.nextInt();
        // int toplam=0;
        // while (sayi>=0){
        //     toplam=toplam+sayi;
        //     sayi--;
        // }
        // System.out.println("girdiginiz sayi ve o sayiya kadar olan sayilarin toplami = " + toplam);


        //SORU: girdiginiz sayinin basamak sayisini bulun ve yazdirin
        //System.out.println("lutfen sayi gir: ");
        //int sayi = scan.nextInt();
        //int count =0;
        //while (sayi>0){
        //    sayi=sayi/10;
        //    count++;
        //}
        //System.out.println(count);


        //int num1 = Integer.MIN_VALUE;
        //System.out.println("num1 = " + num1);

        // soru

      //  System.out.print("asdfasdf" + "safjasşf");
       // System.out.print("asdfasdf" + "safjasşf");
        int arr[][] = { {12}, {21}, {13} };
        for(int[] w : arr) {
            System.out.print(w + " ");

        }







    }
}
