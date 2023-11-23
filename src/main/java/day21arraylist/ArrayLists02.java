package day21arraylist;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Bir List in baska bir list ile ayni olup olmadigini nasil kontrol ederiz
        //iki List in esit olabilmasi icin ayni index te ayni elemanlarin olmasi gerekir

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");
        System.out.println(names1.equals(names2)); //false

        //Verilen iki intege listte tamami ile ayni elemanlarin olup olmadigini kontrol eden code yaziniz

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);
        //ArrayList lerde sort() methodunu kullanmak icin Collections 'lardan cagirmak gerekiyor
        Collections.sort(num1);
        Collections.sort(num2);
        System.out.println(num1.equals(num2)); //true


        //arrayListe bir elemanin ilk gorunumu nasil silinir

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities); //[Miami, Istanbul, Yozgat, Barcelona, Istanbul, Yozgat]

        //remove() methodu bir elemanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami")); //true
        System.out.println(cities);//[Istanbul, Yozgat, Barcelona, Istanbul, Yozgat]

        //arrayListe bir eleman index kullaarak nasil silinir
        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Istanbul, Yozgat, Miami, Istanbul, Istanbul, Yozgat]

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        // ve o elemani silip silmedigini ifade eden true yada false return eder.

        //remove() methodu index ile kullanilirisa bu index de silmis oldugu datayi return eder

        //arrayList olusturuken sag tarafa(constructor) ArrayList yazmak zorundasiniz
        //Ama sol taraf ister arrayList ister List yazin ikiside calisir
        //Detaylari collections konusunda gorecegiz


        //Ornek 2: Bir tane Integer List olusturun ve 12 elemanini siliniz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        System.out.println(ages);
        //1.yol
//        Integer nonPrimitive = 12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        //2.yol Recommended
        ages.remove((Integer) 12);
        System.out.println(ages);

        //3.yol
//        ages.remove(Integer.valueOf(12));
//        System.out.println(ages);

        //4.yol
//        ages.remove(ages.indexOf(12));
//        System.out.println(ages);

        //Bir ArrayListteki bir elemanin tum gorunumlerini nasil sileriz
        //bir Listteki bir elemanin tum gorunumlerini silebiliriz removeAll() ile silebilirz
        // ama removeAll() methodu list ile kullanilir

        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Istanbul");
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove)); //true
        System.out.println(cities); //Miami




    }
}
