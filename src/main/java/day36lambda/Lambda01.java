package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 155);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> courseList = new ArrayList<>();//obje uzerinden manipilasyon yaptik
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);
        //1)tum "avarageScore" larin 91 den buyuk olup olmadigini kontrol eden kodu yaziniz?

        boolean result1 = courseList.stream().allMatch(t -> t.getAvarageScore() > 91);
        //allMatch : tum sartlar saglandiginda true doner eger
        // bir tane bile sart saglanmaz ise sonuc false olur mukemmeliyetci
        System.out.println(result1);

        //2 Kurs isinlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz

        boolean result2 = courseList.stream().anyMatch(t -> t.getCoursName().contains("Turkish"));
        System.out.println(result2);
        //AnyMatch :  Verilen sarta gore stream icindeki herhangi bir elemanin bu sarta uymasi durumunda true verecektir

        //3) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.
        boolean result3 = courseList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println(result3);

        //4) Avarage score u en yuksek olan kursun ismini console a yazdiran kodu yaziniz
        String name1 = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCoursName();
        System.out.println(name1);
        //5 tum course objelerini avarage score goere kucukten buyuye dogru diziniz ve ilk ikisi haric liste halinde yazdiriniz

        List<Course> myList = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());
        System.out.println(myList);

        //6) tum course obj avaage score larina gore kucukten buyuge dogru siralayiniz so 3 unu list halinde siralayiniz

        List<Course> myList2 = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println(myList2);
        //7 Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde listin icinde veren kodu yaziniz.
        List<Course> myList3 = courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).collect(Collectors.toList());
        System.out.println(myList3);

        //8 Kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz
        long ingilizceBolumSayisi = courseList.stream().filter(t -> t.getCoursName().contains("English")).count();
        System.out.println(ingilizceBolumSayisi);

        ///9 Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz
       List<Course> myList4= courseList.stream().filter(t->t.getNumberOfStudents()<140).collect(Collectors.toList());
        System.out.println(myList4);

    }
}
