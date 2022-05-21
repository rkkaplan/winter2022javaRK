package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {

    /*
    bir class'i child class yaptigimizda parent classtaki
    constructora ulasmasi gerekir
    bu durumda parent classtaki constructor'in access modifieri
    uygun bir modifier yapilmalidir. (public ya da protected)
    (parent class baska package'de ama!!)

    child class'da tum constructorlar ilk satirina
    java'nin yerlestirdigi constructor PARAMETRESİZ dir.
    yani super()dir

     */


    Child(){
        super();
        System.out.println("cild class parametresiz const");
    }

    Child(int s ){
        System.out.println("Child class parametreli const");

    }
    Child(int sayi1, int sayi2) {
        //eger parent class'tan parametresiz constructor'i degil de
        // baska bir constructor'i calistirmak isterseniz
        //bunu child class'taki consructor'in ILK SATIRINA yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("child iki parametreli const");
    }

    public static void main(String[] args) {
        Child child = new Child(5,8 );

    }
}
