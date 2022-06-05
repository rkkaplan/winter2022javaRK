package okulProject;

public class Okul {
    static final String okulIsmi = "Kaplan Koleji";  // final yaparak constant(degistirilemez) requirementini sagladık
    static final String adres = "Cankaya / Ankara";  // static yaparak proje icerisinden her class dan ulasılabilmeyi sagladik
    static final String telefon = "0312 236 65 54";


    private Okul(){             // private constructor ile okul class'ina singleton pattern verdik.
                                // yani obje olusturulmasina izin vermiyoruz

    }


}
