package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        /*
        1TreeMap "thread-safe" ve "synchronized" degildir.
        Note:Map lerde multi thread kullanmamiz gerektiginde sadece Hashtable kullanabilirsiniz, cünkü tek alternatif budur.
        2)TreeMap Entry leri key lerine göre natural order a göre siralar . Bu yüzden cook yavastir,
        3)TreeMap lerin key lerinde null kullanilamaz ama value larinda istediginiz kadar kullanabilirsiniz
         */
    long t1 =System.nanoTime();
        TreeMap<String, Integer> countryPopulations = new TreeMap<>();

        countryPopulations.put("USA" , 400000000);
        countryPopulations.put("Netherland" , 18000000);
        countryPopulations.put("Turkiye" , 83000000);
        countryPopulations.put("Belgium" , 12000000);
        countryPopulations.put("Mexico" , 125000000);
        countryPopulations.put("Brasil" , 215000000);
        countryPopulations.put("France" , 75000000);
        countryPopulations.put("Finland" , 8000000);
        countryPopulations.put("Germany" , 85000000);
        System.out.println(countryPopulations);//{Belgium=12000000, Brasil=215000000, Finland=8000000, France=75000000, Germany=85000000, Mexico=125000000, Netherland=18000000, Turkiye=83000000, USA=400000000}
        long t2 = System.nanoTime();
        HashMap<String, Integer> countryPop = new HashMap<>();
        countryPop.put("USA" , 400000000);
        countryPop.put("Netherland" , 18000000);
        countryPop.put("Turkiye" , 83000000);
        countryPop.put("Belgium" , 12000000);
        countryPop.put("Mexico" , 125000000);
        countryPop.put("Brasil" , 215000000);
        countryPop.put("France" , 75000000);
        countryPop.put("Finland" , 8000000);
        countryPop.put("Germany" , 85000000);

        TreeMap<String, Integer> countryPopTree = new TreeMap<>(countryPop);
        System.out.println(countryPopulations);
        long t3 = System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);

    }
}
