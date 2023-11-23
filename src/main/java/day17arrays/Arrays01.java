package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //arrayleri kisa yoldan nasil olusturabiliriz

        int arr[] = {63, 19, 313, 353, 7, 100, 4};
        System.out.println(Arrays.toString(arr)); //[63, 19, 313, 353, 7, 100, 4]

        //Example 1: Verilen arrayde kactane cift sayi ve kactane tek sayi oldugunu bulan code yaziniz
        int count = 0;

        for (int w: arr ) {
            if (w%2==0){
                count++;
            }

        }

        System.out.println("Arrray de " + count+ " adet cift sayi, " + (arr.length- count)+ " adet tek sayi kullanilmistir");

        //Example 2: Size verilen bir string Arraydeki isimlerden
        // 5 karakterden az karakter icerenleri console yazdiriniz
        String stdNames[] = {"Ajda", "Cuneyt", "Tom", "Ayhan", "Filiz"};
        System.out.println(Arrays.toString(stdNames));
        for (String w : stdNames) {
            if (w.length()<5){
                System.out.println(w);
            }


        }
        //Example 3: Size verilen bir string arraydeki isimleri alfabetik
        // siraya koyduktan sonra "F" ile baslayan isimler haric diger isimleri console yazdiriniz

        //Note1: sort() methodu sayisal data type lari kucukten buyuge dogru siralar(ascending order)
        //Note1: sort() methodu String data type lari alfabetik olarak siralar(alphabetical order)
        //Note3: ascending order + alphabetical order ==> Natural Order
        //Note4: sort() methodu arraydaki elemenlari "Natural Order" olarak siralar

        Arrays.sort(stdNames);

        for (String w : stdNames) {
            if (w.startsWith("F")) {
                continue;
            }
            System.out.println(w);

        }


    }
}
