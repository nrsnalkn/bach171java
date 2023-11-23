package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        /*

    1)Setler tekrarsiz eleman(unique) depolamak icin kullanilir
    2)3 tane set class vardir
      a)HashSet Class:
           "Hash" benzersiz bir id olusturma teknigidir. Bu teknige "Hashing Technique" denir
           "HashSet" elemanlari rastgele siralar
           "HashSet" elemanlari siralamadigindan cok hizli calisir.
           "HashSet" ler "null" i eleman olarak kabul eder


      b)LinkedHashSet Class:
           "LinkedHashSet" elemanlari sizin verdiginiz siraya göre dizdiklerinden(insertion order)
            "HashSet" lere göre yavastirlar
           "LinkedHashSet" ler tekrarsiz eleman depolamak icindir

      c)TreeSet Class
           "TreeSet" ler elemanlari natural order ile (kücükten büyüge yada alfabetik siraya göre) dizerler

           En yavas set "TreeSet" tir.

     3)"TreeSet" cook yavas oldugundan mümkün oldugu kadar TreeSet kullanmamaya calisiriz
         */

        HashSet<String> hs = new HashSet<>();
        hs.add("Mustafa");
        hs.add("Suat");
        hs.add("Saadet");
        hs.add("Fevzi");
        hs.add("Ali");
        hs.add("Veli");
        hs.add("Can");
        hs.add(null);
        System.out.println(hs);//[null, Can, Mustafa, Suat, Veli, Saadet, Fevzi, Ali]

        hs.add("Mustafa");//tekrarli eleman istedigimizde hata vermez ama tekrarli elemani sadece birkere ekler
        System.out.println(hs);//[Can, Mustafa, Suat, Veli, Saadet, Fevzi, Ali]

        System.out.println(hs.hashCode());//1324654184 her bilgisayarda farkli doner

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(19);
        lhs.add(13);
        lhs.add(-35);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);//[7, 19, 13, -35, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(7);
        ls.add(119);
        ls.add(13);
        ls.add(353);
        ls.add(313);
        lhs.retainAll(ls);//ortak olanlari alir ve ictekinin elemanlarini korur disdakini ize bozar

        System.out.println(lhs);//[7, 13]
        System.out.println(ls);//[7, 119, 13, 353, 313]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('T');
        ts.add('Z');
//        ts.add(null);
//        ts.add(null); NullPointerException TreeSetlere null eklenemez
        System.out.println(ts);//[A, B, E, G, L, T, Z]
        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('E'));//B ==> Verilen elemandan bir onceki elemani verir
        System.out.println(ts.lower('F'));//E ==> Verilen elemandan bir onceki elemani verir
        System.out.println(ts.lower('A'));//null ==> Verilen elemandan bir onceki elemani verir

        System.out.println(ts.higher('L'));//T ==>Verilen elemandan bir sonraki elemani verir
        System.out.println(ts.higher('N'));//T ==>Verilen elemandan bir sonraki elemani verir

        System.out.println(ts.headSet('G'));//[A, B, E]
        System.out.println(ts.headSet('G',true));//[A, B, E, G] // elementi dahil ettik

        System.out.println(ts.tailSet('L')); //[L, T, Z] default olarak elementi dahil ettik
        System.out.println(ts.tailSet('L',false)); //[L, T, Z] elementi dahil etme

        System.out.println(ts.ceiling('T'));// eleman varsa bize onu dondurur
        System.out.println(ts.ceiling('O'));//eger yok ise elemana en yakin olani donduruts
        System.out.println(ts.floor('B'));//B
        System.out.println(ts.floor('D'));//B
        System.out.println(ts.subSet('B', 'L'));//[B, E, G]
        System.out.println(ts.subSet('B',false ,'L',true));//[E, G, L]




    }
}
