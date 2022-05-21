package okulProject;

public class Okul {
    static final String okulIsmi = "Kaplan Koleji";  // final yaparak constant(degistilemez) requirementini sagladık
    static final String adres = "Cankaya / Ankara";  // static yaoarak proje icerisinden her class dan ulasılabilme yi sagladik
    static final String telefon = "0312 236 65 54";


    private Okul(){                                   // private constructor ile okul classini singleton pattern verdik. yani obje olusturulmasina
                                                        // izin vermiyoruz

    }


}
