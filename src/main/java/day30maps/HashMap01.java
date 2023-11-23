package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
          /*
        1)  Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2)  key kismi tekrarsiz, value kismi tekrarli olabilir
        3)  Map lerdeki her bir elemana Entry denir, tamamina ise EntrySet denir
        4)  Entry ler tekrarsiz oldugu icin EntrySet  denilir
        5)  Key ve value lar ayri ayri data typelarinda olabilirler
        6)  Map ler collection degildir, farkli bir yapidir
         */

        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 8400000);
        countryPopulation.put("Netherland", 180000);
        System.out.println(countryPopulation); //{Germany =83000000, USA=400000000, Turkey=8400000, Netheland=180000, Albania=3000000}

        //get() key ile calisir ve istenen value yu verir
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //butun key leri nasil alabiliriz keySet() methodu ile aliriz ve bize set dondurecegi icin bir Set konteynirina atariz
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys); //[USA, Turkey, Netheland, Germany, Albania]

        //butun value lari nasil alabiliriz
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[400000000, 8400000, 180000, 83000000, 3000000]

    //ornek countryPopulation map indeki ulkelerin nufuslarinin ortalamasi kactir
        Collection<Integer> value = countryPopulation.values();
        int sum= 0;
        for (Integer w :value) {
            sum = sum +w;

        }
        System.out.println(sum/value.size());//98916000
        //entrySet() map deki entry leri kalip halinde alip map in icine koyarak bize verir
        //Loop lar map de kullanilamaz bu yuzden entrySet kullaniriz
        Set<Map.Entry<String,Integer>> entries =   countryPopulation.entrySet();
        System.out.println(entries);

        //ornek2: countryPopulation mapindeki ulkelerin isimlerinin karakter sayisi ile nufuslarinin toplamini bulunuz


        int toplam =0;
        for (Map.Entry<String, Integer> w :entries) {

       toplam = toplam+   w.getKey().length() + w.getValue();
        }
        System.out.println(toplam); //494580033

    }
}
