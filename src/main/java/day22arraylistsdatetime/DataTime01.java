package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DataTime01 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimdeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println("myCurrentDate = " + myCurrentDate);//2023-06-07

        //tarihten istedigimiz bileseni nasil aliriz

        int monthValue = myCurrentDate.getMonthValue(); // month
        System.out.println("monthValue = " + monthValue);

        int dayofMonth = myCurrentDate.getDayOfMonth(); // day
        System.out.println("dayofMonth = " + dayofMonth);

        int year = myCurrentDate.getYear(); //year
        System.out.println("year = " + year);


        //Month bir enum dir
        //Enum javada sabit degeler (Ay isimleri , Gun isimleri , ulkedeki sehir isimleri) depolamak icin kullanilir
        Month monthName = myCurrentDate.getMonth();
        System.out.println("monthName = " + monthName); //JUNE

        //DayOfWeek bir enum dir
        DayOfWeek dayOfWeekValue = myCurrentDate.getDayOfWeek();
        System.out.println("dayOfWeekValue = " + dayOfWeekValue);

        //ileriki tarihe nasil gidilir

        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3));

        //gecmis tarihe nasil gidilir

        System.out.println(myCurrentDate.minusDays(5).minusMonths(5).minusYears(7));


        //specific bir tarih object i nasil olusturulur
        LocalDate date1 = LocalDate.of(1990, 8, 10);
        LocalDate date2 = LocalDate.of(1980, 8, 10);
        System.out.println(date1);

        //Bir tarihin bir tarihten sonra olup olmadigi nasil kontrol edilir ?

        boolean r1 = date1.isAfter(date2); // date1 date2 den sonra mi
        System.out.println(r1); //true

        boolean r2 = date1.isBefore(date2); //date1 date2 den once mi
        System.out.println(r2); //false

        boolean r3 = date1.isEqual(date2); // date1 date2 'ye esit mi
        System.out.println(r3); //false

    }
}
