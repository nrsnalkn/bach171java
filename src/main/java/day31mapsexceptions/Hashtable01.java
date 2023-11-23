package day31mapsexceptions;

import java.util.Hashtable;

public class Hashtable01 {
    /*
     HashMap ile Hashtable arasindaki fark nedir?
       1)HahMap thread-safe ve synchronized degildir.Hashtable thread-safe ve synchronized'tir
       2)HashMap bir tane null key e ve istediginiz kadar null value a müsaade eder
       ama Hashtable key lerde ve value larda null kullanilmasina müsaade etmez.
       3)HashMap hizlidir , Hastable HashMap lere göre yavastir
  */
    public static void main(String[] args) {
        Hashtable<String, Integer> stdAges = new Hashtable<>();
        stdAges.put("Mustafa", 41);
        stdAges.put("Seda", 30);
        stdAges.put("Ekim", 22);
        stdAges.put("Ali Can", 18);

        //stdAges.put(null , 18);
        // stdAges.put("Mehmet",null);
        System.out.println(stdAges);

    }
}
