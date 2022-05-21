package free_practice;

import java.util.Scanner;

public class free19 {
    //Soru5 Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi gir: ");
        String day = scan.nextLine();

        switch(day) {
            case "MONDAY" :
            case "TUESDAY" :
            case "WEDNESDAY" :
            case "THURSDAY" :
            case "FRIDAY" :
                System.out.println("weekdays");
                break;
            case "SATURDAY" :
            case "SUNDAY" :
                System.out.println("weekends");
                break;
                default:
                    System.out.println("invalid entry, you made a wrong entry, incorrect   ");
        }
    }

}
