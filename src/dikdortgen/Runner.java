package dikdortgen;

public class Runner {
    public static void main(String[] args) {
        Dikdortgen obj1 = new Dikdortgen(4,3);

        System.out.println(obj1.getUzunKenar());
        System.out.println(obj1.getKisaKenar());
        obj1.setUzunKenar(78);
        System.out.println(obj1.getUzunKenar());

        obj1.printCevre();
        obj1.printAlan();

        Dikdortgen obj2 = new Dikdortgen(6,5);
        obj2.printCevre();
        obj2.printAlan();

    }


}
