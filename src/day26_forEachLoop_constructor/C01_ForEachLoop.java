package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[] = {2,4,6,8,11};

        //elementleri for loop ile yazdiralim

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");


        //bunu for each loop ile yapacak olursak
        //for each loopu calistirmak icin hedef bir collection vermeliyiz

        for (int each: arr
             ) {
            System.out.print(each + " ");

        }

        // avantaji: index, baslangic degeri, bitis degeri gibi detaylarla
        // ugrasmamiza gerek kalmadan collectionstan tum elementleri bize getirir.
        // dezavantaji: index e bagli bir islem yapamayizz



    }
}
