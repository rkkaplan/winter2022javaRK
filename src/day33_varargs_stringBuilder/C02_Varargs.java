package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        // parametre olarak bir int
        //ve istedigimiz kadar String alan
        //en uzun kelimenin harf sayisi ile int parametre degerini
        //carpip sonucu yazdiran bir method olusturun

        int sayi = 5;
        String str1 = "Zülal";
        String str2 = "Zeynep";

        carpim(sayi, str1, str2);
        //bir methodda varargs disinda parametre kullannacaksak
        // once diger parametleri yazip, varargsi en sona yazmaliyiz
        // bu sebeple bir methodda birden fazla varargs olamaz
    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr = "";

        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }

        }

        System.out.println("Istenen deger: " + sayi * enUzunStr.length());

    }
}
