package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Gulce",30);
        stdAges.put("Abdullah",24);
        stdAges.put("Benna",22);
        stdAges.put("Hasan",30);
        stdAges.put("Suleyman",22);
        //key i tekrarli kullandigimizda hata vermez en son verilen entry nin degerini kabul eder
        //Bu yontem value guncellemek icin kullanilabilir.Bu overwrite denir
        stdAges.put("Abdullah",24);


        //1map ler entryleri siralarken key lere bakilarak siralama yapar
        //HashMaplaer entry leri rastgele siralar o yuzden cok hizlidir
        System.out.println(stdAges);//{Suleyman=22, Hasan=30, Abdullah=24, Gulce=30, Benna=32}

        //replace() methodu value lari key lei kullanarak update etmeye yarar
        stdAges.replace("Hasan",35);
        System.out.println(stdAges);//{Suleyman=22, Hasan=35, Abdullah=24, Gulce=30, Benna=22}

        //replace("Gulce",30,35) methodu map icinde Gulce varsa ve degeri 30 ise yeni degeri 35  olsun yoksa olmasin

        stdAges.replace("Gulce",30,35);
        System.out.println(stdAges);

        //putIfAbsent("Ali",18) methodu map de ali key olarak yoksa map e 18 value ile ekle demektir
        stdAges.putIfAbsent("Ali",18);//{Suleyman=22, Hasan=35, Abdullah=24, Gulce=35, Benna=22, Ali=18}
        System.out.println(stdAges);

        //get() ve getOrDefault() methodlari map de aranan eleman map de varsa ayni sayiyi verir
        System.out.println(stdAges.get("Abdullah"));//24
        System.out.println(stdAges.getOrDefault("Abdullah", 0));
        //eger yoksa get() null verir getOrDefault() default olarak giridigimiz degeri verir
        System.out.println(stdAges.get("Mehmet"));//null verir
        System.out.println(stdAges.getOrDefault("Mehmet", 0));//0

        //stdAges.containsValue(63) methodu mapin icindeki valu larin icinde 63 olup olmadigini kontrol eder
        System.out.println(stdAges.containsValue(63));//false
        //containsKey("Seda") methodu mapin icindeki keylerin icinde Seda olup olmadigini kontrol eder
        System.out.println(stdAges.containsKey("Seda"));//false

        //remove("Abdullah"); methodu key kullanarak entry yi silmeye yarar
        stdAges.remove("Abdullah");
        System.out.println(stdAges);
        //remove("Ali",19); methodu hem key hemde value yu kontrol eder ve eslesirse silme yapar eslesmiyorsa silmez
        stdAges.remove("Ali",19);
        System.out.println(stdAges);


    }
}
