package free_practice;

public class free24 {
    //Soru 1
    // String methodlarini kullanarak "Java ogrenmek123 Cok guzel@ " String’ini
    //                                  “Java ogrenmek cok guzel." sekline getirin

    public static void main(String[] args) {
        String str = "Java ogrenmek123 Cok guzel@ ";
        str = str.replaceAll("\\d", "");
        str = str.trim();
        str = str.replaceAll("\\W", " ");
        System.out.println(str);
        System.out.println(str.indexOf("C"));




    }
}
