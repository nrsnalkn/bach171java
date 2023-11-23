package day14loops;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14
        */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen baslangic degeri girin");
//        int start = input.nextInt();
//        System.out.println("Lutfen bitis degeri giriniz..");
//        int end = input.nextInt();
//
//        if (start > end) {
//            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
//        } else {
//            for (int i = start; i <= end; i++) {
//
//                if (i % 2 == 0) {
//                    System.out.println(i);
//                }
//            }
//        }

        //Example 2: Hic sayi kullanmadan 1 den 100 kadar olan sayilari console yazdiriniz // ascii degerleri ile yapilabilir
        //d nin ascii degeri 100 dur

        for (int i = 'd' / 'd'; i <= 'd'; i++) {
            System.out.print(i + " ");

        }




                /*
        Note 1: Bazi loop lar sonsuz defa calisabilir, Bu tarz looplara Infinite (sonsuz) loop denir
                Infinite (sonsuz) loop genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir

             for (int i = 1; i <10 ; i--) {
        }

       Note 2:  Loop olusturdugumuzda "ikinci kismi"(loop calisma sarti) yazmazsaniz  Infinite (sonsuz) loop olur
            for (int i = 0;     ; i++) {

            }
       Note 3: Bazi looplar hic calimayabilir

        for (int i = 1; i <0 ; i--) {

        }
         */



    }
}
