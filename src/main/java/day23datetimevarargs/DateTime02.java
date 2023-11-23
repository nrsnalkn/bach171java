package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //21:01:52.707453400

        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nono = myCurrentTime.getNano();
        System.out.println(nono);

        //gelecek ve gecmise nasil gidilir

        LocalTime plustime = myCurrentTime.plusMinutes(13).plusHours(3)
                .minusMinutes(13).minusHours(3);
        System.out.println(plustime);

        //zaman formati nasil degistirilir
        /*
        DateTime classta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi AM, PM gostermez
        hh : mm a == 12 li saat sistemi Am, PM gosterir
        HH : mm : ss ==> 12 li saat sistemi
        HH : MM =>Yanlis format
        "mm" minute demektir. "MM" month demektir

        dd-MM-yy ==> gun ay yil
        MMM ==> Aug
        MMMM ==> August

         */


        DateTimeFormatter dTF1 = DateTimeFormatter.ofPattern("HH : mm");

        String formattedMyCurrentTime = dTF1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formati nasil degistirlir
        LocalDate myDate = LocalDate.of(2023, 8, 13);
        System.out.println(myDate);//2023-08-13

        //Tarih AY/Gun/Yil
        DateTimeFormatter dTF2 = DateTimeFormatter.ofPattern("MM:dd:yyyy");
        String formattedMyDate = dTF2.format(myDate);
        System.out.println(formattedMyDate);

        //tarihi Gun/ay isminin ilk 3 harfi / yil sekline cevriniz 13/Aug/23

        DateTimeFormatter dTF3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyDate1 = dTF3.format(myDate);

        System.out.println(formattedMyDate1);

        //tarihi Gun/ay isminin  / yil sekline cevriniz 13/Aug/2023


        DateTimeFormatter dTF4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyDate2 = dTF4.format(myDate);
        System.out.println(formattedMyDate2);

        //baska bir zaman dilimindaki tarih ve zamani nasil alabiliriz?
        LocalDate dateInTokya = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokya);
        //Amsterdam da ayin kaci

        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //tokyo da saat kac
        LocalTime timeInTokya = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokya);
        //Amsterdam da saat kac
        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);



    }
}
