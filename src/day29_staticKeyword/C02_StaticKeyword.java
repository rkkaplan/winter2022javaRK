package day29_staticKeyword;

public class C02_StaticKeyword {

    public static void main(String[] args) {

        //baska classtaki static class uyelerine ulasabilmek icin
        // sadece classIsmi.staticUyeIsmi
        // yazmamiz yeterlidir

        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu = "3125474747";

        System.out.println(C01_Static.okulTelefonu); //  3125474747

        // Baska classtaki static olmayan class uylerine
        // ancak o classtan obje olusturarak ulasabiliriz
        // ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        C01_Static obj1 = new C01_Static();
        C01_Static obj2 = new C01_Static();

        System.out.println(obj2.okulIsmi); // Yildiz Koleji
        obj2.okulIsmi = "Sabir Koleji";
        System.out.println(obj1.okulIsmi); // Yildiz Koleji

    }
}
