package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu =LocalDate.of(1991,03,28) ;

        System.out.println(Period.between(dogumGunu,bugun)); // P31Y7D  ( 31yas 7 gun)

        System.out.println(Period.between(dogumGunu,bugun).getYears()); // 31
        System.out.println(Period.between(dogumGunu,bugun).getDays()); // 7



    }
}
