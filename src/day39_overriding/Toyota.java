package day39_overriding;

public class Toyota extends Araba {

    String hiz = "Toyota araclar maksimum 220 km hiz yapar";
    String marka = "Toyota";
    String sirketMerkezi = "Japonya";

    public void motor() {
        System.out.println("toyota Arabalar toyota marka motor kullanirlar");
    }

    public void garanti() {
        System.out.println("toyota araclar 10 yil garantilidirler");
    }
}
