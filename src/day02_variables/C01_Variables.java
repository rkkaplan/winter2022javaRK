package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        // bir variable oluştururken içerisine koyacagım datanın alabileceği değerlere uygun
        // bir data türü seçmeliyiz
        //örneğin bir şehrin nüfusundan bahsediyorsak
        // variablemizin data türü String, boolean, char veya double olamaz
        // geriye kalan tamsayı türlerinden şehrin nüfusnu içine alan bir data
        // türü seçebiliriz
        //biz kurs boyunca genelde tam sayılar için int, ondaliıklı sayılar için double

        System.out.println("Hello World yazdıran Javayı halleder");

        int level=1;

        System.out.println(level);


        boolean ogrenciMi= true;

        boolean yagisVarMi= false;

        char ozelSembol='&';
        char sayi='2';

        System.out.println(sayi);

        System.out.println(yagisVarMi);
    }
}
