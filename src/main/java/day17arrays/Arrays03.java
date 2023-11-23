package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin arrayde olup olmadigini anlamak icin gereken kodu yaziniz

        String names [] = {"K","C","R","A","S"};
        String el ="R";

        //1.way
        int counter =0;
        for (String w: names){
            if (w.equals(el)) {
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("array has " + el);
        } else {
            System.out.println("Array does not have " +  el);
        }
        //2.way binarysearch() methodu hizli calisir
        /*
        1) binarySearch() methodu sort () kulanmadan kullanmayiniz,
        cunku binarySearch() mantigi sirali elemanlar mantigi ile calisir
        2) binarySearch()  methodu var olan elemanin index sini verir.
        binarySearch()  methodu aldiginiz index o veya 0 dan buyukse o eleman arrayde var demektir
        3)binarySearch()  methodu olmayan elemenlar icin negatif tamsayi degeri verir.
        "-" isaretinin anlami o eleman yok demektir
        "sayi" ise o elemna olsaydi kacinci elemen olurdu demektir
         */

        Arrays.sort(names);

        System.out.println(Arrays.toString(names)); //[A, C, K, R, S]
        int result = Arrays.binarySearch(names, el);
        System.out.println(result);

        if (result < 0) {
            System.out.println("Array doesn't have " + el);
        } else {
            System.out.println("Array has " + el);
        }
        int num1 = Arrays.binarySearch(names, "A");
        System.out.println(num1);//0 ==> var hemder index i sifir

        int num2 = Arrays.binarySearch(names, "K");
        System.out.println(num2);//0 ==> var hemder index i 2
        int num3 = Arrays.binarySearch(names, "U");
        System.out.println(num3);//-6 ==> eleman yok
        // 6 olsaydi 6 eleman olurdu


    }
}
