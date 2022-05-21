package free_practice;

public class free22 {
    //Soru 1 Kullanicidan email adresini girmesini isteyin,
    //          mail
    //          @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
    //          @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “
    //          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

    public static void main(String[] args) {
        String email = "qwertasdfzxcv@gmail.com";
        String word = "@gmail.com";
        if (!email.contains(word)) {
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith(word)) {
            System.out.println("Email adresiniz kaydedildi");
        } else{
            System.out.println("lutfen yazimi kontol edin");
        }
    }
}
