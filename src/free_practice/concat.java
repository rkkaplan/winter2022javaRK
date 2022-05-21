package free_practice;

public class concat {
    /*
    2 kelime oluşturun: isim1 ve isim2

// isim1 çift sayıda karakter içeriyorsa,

    // ikinci kelimeyi ilk adın ortasına yerleştirin

    // ilk kelime tek sayida karakter iceriyorsa

    // “isim1, isim2 ye eklenemiyor” yazdırın

    // Örneğin:
    // isim1= mehmet
    // isim2= ahmet
    // Yazdır ==> mehahmetmet

    // isim1= memet
    // isim2= ahmet
    // Yazdır ==> isim1, isim2 ye eklenemiyor
     */
    public static void main(String[] args) {
        String name1 = "Javacan";
        String name2 = "Selenium";
        if (name1.length() % 2 == 0) {
            System.out.println(name1.substring(0, name1.length() / 2).concat(name2).concat(name1.substring(name1.length() / 2)));


        } else System.out.println("name1, name 2 ye eklenemiyor");
    }
}
