package day36_inheritance;

public class SurekliIsciler extends Isci{



    public static void main(String[] args) {
        SurekliIsciler surIsc1 = new SurekliIsciler();
        surIsc1.persNo=5001;
        surIsc1.isim = "Cem";
        surIsc1.soyisim ="Akay";
        surIsc1.statu ="Isci" ;
        surIsc1.saatUcreti = 11;
        surIsc1.maas = surIsc1.maasHesapla();

        System.out.println(surIsc1); // SurekliIsciler{isciStatu='Surekli Isci', saatUcreti=11, statu='Isci', maas=2640, persNo=5001,
                                     // isim='Cem', soyisim='Akay', adres='null', tel='null'}


    }
    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
