package day21arraylist;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {


        /*
            1- Ayni data typeindaki coklu datalari kullanmak icin kullanilir
            2- Arraylerin negatif yonu var icine koyacagimiz eleman siyisini belirlemek gerekir.
            3- Array eleman sayinda esnek degildirler bu yuzden ArrayList adli bir yapi olusturmus.
            Bu yapi eleman sayisinda esnektir.Hic eleman koymazsaniz eleman sayisini 0 olarak ayarlar.
            4- ArrayList yerine List de diyebilirsiniz.
            5- Java Arraylistleri olusturduktan sonra Array leri iptal etmedi;
              a-Arrayler superfasttir.
              b-Arrayler memoryde cok az yer kaplar
              c-bu nedenle eleman sayisi belli olan datalai depolamak icin Arrayler tercih edilir.
            6-Arrayler pirimitive data typelari ve referanslari depolayabilir.
            Ama Arraylistler non-primitive data typelari depolar.Bu nedenle Arraylistler arraylerden daha cok yer kaplar.
           */

        //ArrayList nasil olusturulur
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //arrayList console da nasil yazdirilir
        System.out.println(ages);
        //ArrayList lere eleman ekleme nasil olur
        //arrayList lere eleman eklemek icin add() methodu eklenir add()
        // methodu sizin verdiginiz sirada liste ekller (insertion order)

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);

        System.out.println(ages);

        //List'e coklu eleman nasil eklenir veya liste baska bir List nasil eklenir
        //Bir List e coklu eleman eklemek icin o elemanlri oncelikle bir listin icine koymaliyiz

        ArrayList<Integer> newAge = new ArrayList<>();
        newAge.add(8);
        newAge.add(9);
        newAge.add(10);
        System.out.println(newAge);
        ages.addAll(newAge);
        System.out.println(ages); //[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2, newAge);
        System.out.println(ages);

        //ArrayList'lerde eleman sayisi nasil bulunur
        // size() methodu bir Liste ki eleman sayisini verir
        int numOfElemant = ages.size();
        System.out.println(numOfElemant);

        //ArrayList te specific bir eleman nasil alinir
        //get(); methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //arrayList te specific bir elemani nasil degistirebiliriz? set() methodu ile
        ages.set(6, 111);
        System.out.println(ages); //[9, 656, 8, 9, 10, 12, 111, 10, 888, 8, 9, 10]

        ages.set(4, 333);
        System.out.println(ages);
        //Bir Listte tum elemanlari nasil silebiliriz
//        ages.clear();
//        System.out.println(ages);

        //ArrayListte spesific bir elemanin var olup olmadigini nasil anlariz
        boolean r = ages.contains(333);
        System.out.println(r);

        //Bir ArrayListin bos olup olmadigini nasil kontrol ederiz
        //isEmpty() methodu arrayList bos ise true bos degilse false return eder
        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        //Ornek 1:Size verilen bir Listin bos olup olmadigini kodrol eden code yaziniz
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Seda");
        names.add("Benna");
        names.add("Ridvan");
        names.add("Enes");
        System.out.println(names);

        //1way
        if (names.size() == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("List has at least 1 element");
        }
        names.clear();// names list indeki isimler silindi

        //2.way
        if (names.isEmpty()){
            System.out.println("List is EMPTY");
        } else {
            System.out.println("List has at least element");
        }

        /*
        Bir methodu ogrenirken asagidaki uc seyi ogrenin
        1) o method ne is yapar
        2) o method nasil kullanilir


         */



    }
}
