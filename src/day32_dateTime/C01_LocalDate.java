package day32_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now(); // objenin olusturuldugu tarihi trh'ye atar
        LocalDate baskaTrh = LocalDate.of(1991, 3, 28);
        //istedigimiz yil ay ve gun degerlerine gore bize obje olusturur
        System.out.println(trh); // 2022-04-04
        System.out.println("baskaTrh = " + baskaTrh);

        //getli methodlarla tarih ile ilgili detay bilgileri alabiliriz

        System.out.println(trh.getDayOfMonth()); // 4
        System.out.println(trh.getDayOfWeek()); // MONDAY
        System.out.println(trh.getMonthValue()); // 4
        System.out.println(trh.getYear()); // 2022

        // bir tarihten istedigimiz kadar ileri veya geri gidebilirz

        System.out.println(trh.minusWeeks(20)); // 2021-11-15
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-02-25

        System.out.println(trh.plusDays(100)); // 2022-07-13

        // tarih dile gore degismez

        System.out.println(LocalDate.now().isLeapYear()); // false





    }
}
