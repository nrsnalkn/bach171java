package day16arraysforeachloops;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1: String array olusturun icine 5 tane eleman ekleyin
        //ilk eleman ile son eleman icerdigi karakter sayilari toplamini ekrana yazdirin

        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(arr[0].length() + arr[arr.length - 1].length());

        //Example 2:String bir arry olusturun, icine 5 tane eleman ekleyin,
        // tum elemanlarin icerdigi karakter sayilarinin toplamini ekrana yazdirin

        String arr2[] = new String[5];
        arr2[0] = "Miami";
        arr2[1] = "Istanbul";
        arr2[2] = "Ankara";
        arr2[3] = "Erzurum";
        arr2[4] = "Bolu";

        //1.way for loop
        int totalChar = 0;

        for (int i = 0; i < arr2.length; i++) {
            totalChar = totalChar + arr2[i].length();

        }
        System.out.println(totalChar);

        //2. yol for each loop (enhanced loop)
        //baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        // for-each-loop "Array" lerde ve "collection" larda kullanilir
        /*
        kalibini olusturalim
        for(DataType  w: arr/collection ){
            calisacak kodlar
        }
        */
        int sum = 0;
        for (String w : arr2) {
            sum = sum + w.length();

        }
        System.out.println(sum);

        //example 3: Notlar adinda int bir array olusturun icine 6 tane not
        // yerlestiriniz ve not ortalamasini ekrana yazdiriniz

        int notlar[] = new int[6];
        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;
        System.out.println(Arrays.toString(notlar));
        int toplam = 0;

        for (int w : notlar) {
            toplam = toplam + w;

        }
        System.out.println(toplam / notlar.length);

    }
}
