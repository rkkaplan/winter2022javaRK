package day33_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Yasasin Java");

        System.out.println(sb1.indexOf("Java")); // 8

        System.out.println(sb1.lastIndexOf("s")); // 4
        System.out.println(sb1.indexOf("s")); // 2

        System.out.println(sb1.replace(0, 7, "Ne guzel")); // Ne guzel Java

        System.out.println(sb1); // Ne guzel Java // normalde strinbuilder degil de string olsaydi, burada
                                                  // eski hali olan "Yasasin Java" yazacakti!!! MUTABLE

        System.out.println(sb1.toString().toUpperCase()); // NE GUZEL JAVA
        System.out.println(sb1); // Ne guzel Java //once "toString" ile stringe cevirdigimiz icin eski hailini yazdirdi!!!!


        System.out.println(sb1.delete(0,3)); // guzel Java

        System.out.println(sb1.deleteCharAt(5)); // guzelJava  //5.indexteki karakteri sildi




    }
}
