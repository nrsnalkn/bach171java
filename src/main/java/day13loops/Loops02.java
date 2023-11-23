package day13loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        //ornek 1: 21 den 180 kadar hem 2 hemde 3 ile bolune bilen tam sayilari ekrane yazdiriniz


        for (int i = 21; i < 181; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        //Ornek 2: Size verilen kucuk harf ile yazilmis Stringin index i cift sayi
        // olan characterlerini buyuk harfe donusturen kodu yaziniz
        System.out.println();
        String s = "ankara";
        //              i<=s.length()-1
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);// charAt() kullanilabilir ama harf return eder substring ise string rutern eder
            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());

            }

        }

        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"

        String s1 = "Tramvay";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }
        System.out.println();
    //Ornek 4: Verilen bir string te son 'a'a dan sonraki tum characterleri ters sirada yazdiriniz
    //"Germany"  == > yn

    String t = "Germany" ;
        for (int i = t.length()-1; i >=0  ; i--){
            char ch1 = t.charAt(i);
            if (ch1=='a'){
                break;
            }
            System.out.print(ch1);

        }






    }
}
