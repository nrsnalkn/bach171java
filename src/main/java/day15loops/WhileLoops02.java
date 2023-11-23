package day15loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
              3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30*/

        Scanner input =new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz...");
        int num = input.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(num + " x " + i + " = " + (num * i));

            i++;

        }
        System.out.println();

        // Example 2: Verilen bir stringte her harfin sonrasina "*" sembolu ekleyiniz
        //Java ==> J*a*v*a*

        System.out.println(" Lutfen bir kelime girin...");
        String word = input.next();
        String neWord = "";
        int a = 0;
        while (a < word.length()) {
            neWord = neWord + word.charAt(a) + "*";

            a++;
        }
        System.out.print(neWord);
        System.out.println();

        //Example 3: Bir strtingde ki tekrarsiz characterleri console yazdirin
        //kertenkelle ==> rtn
        //indexOf("k)==> 0 farkli ise tekrarli
        //lastIndexOf("k") == > 6

        //indexOf("r)==> 2 ayni  ise tekrarsiz
        //lastIndexOf("r") == > 2

        String s = "kertenkelle";
        String sonuc = "";

        int b = 0;
        while (b < s.length()) {
            char ch = s.charAt(b);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                sonuc = sonuc + ch;
            }


            b++;
        }
        System.out.print(sonuc);









    }


}
