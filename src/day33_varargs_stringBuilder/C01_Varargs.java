package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        // kac tane string verilirse verilsin
        //iclerinden en uzununu yazdiran bir method olusturun
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4 = "Sametli";

        // yazilan argumewnt sayisi sabitse her zamanki gibi bir method olusturabilriz
        // ancak argument sayisinin degisme ihtimali varsa
        // o zaman varargs tercih edilir

        enUzunKelime(str1, str2, str4, str3);
    }

    private static void enUzunKelime(String... str) {
        String enuzunStr = "";

        for (String each : str
        ) {
            if (each.length() > enuzunStr.length()) {
                enuzunStr = each;
            }

        }
        System.out.println("En uzun Kelime: " + enuzunStr);


    }
}
