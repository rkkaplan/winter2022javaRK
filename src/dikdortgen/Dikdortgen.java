package dikdortgen;

public class Dikdortgen {
    private int uzunKenar;
    private int kisaKenar;


    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int yeniDeger) {
        uzunKenar = yeniDeger;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int yeniDeger) {
        kisaKenar = yeniDeger;
    }

    public void printCevre() {
        int cevre = (uzunKenar + kisaKenar) * 2;
        System.out.println("cevre = " + cevre);
    }

    public void printAlan() {
        int alan = kisaKenar * uzunKenar;
        System.out.println("alan = " + alan);
    }
    public Dikdortgen (int uzun, int kisa){
        uzunKenar = uzun;
        kisaKenar = kisa;
    }
}
