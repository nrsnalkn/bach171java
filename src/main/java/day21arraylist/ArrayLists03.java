package day21arraylist;

import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Kisa yoldan bir list nasil olusturulur

        List<Character> initials = List.of('a', 'c','a', 'b', 'k');
        System.out.println(initials);


       // initials.add('b');
       // initials.set(0, 'u');
       // initials.remove(initials.indexOf('a'));
       // System.out.println(initials);

        //List.of() degistirilemez bir List olusturur
        // bu nedenle List uzerinde degisiklik yapmaya yonelik methodlari desteklemez
        // ama diger list methodlarini destekler

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumun indexini verir

        int r1 = initials.indexOf('a');
        System.out.println(r1);

        //LastindexOf(aranan karakter) methodu aranan karakterin son gorunumun indexini verir

        int r2 = initials.lastIndexOf('a');
        System.out.println(r2);



    }
}
