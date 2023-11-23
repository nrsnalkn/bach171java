package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin coklu datayi bir arraya yerlestirebilmesi,
        // birde istedgi zaman durdurabilmesi icin gereken kodu yaziniz

        /*
        1) kullanicidan data almak icion Scanner object olustur
        2) Coklu datayi yerlestirmek icin bir array olusturmaliyiz
        3)Array olusturabilmek icin kullanicidan array ye kactana eleman koyacagini almaliyiz
        4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisini giriniz...");
        int numOfelements = input.nextInt();

        String stdNames[] = new String[numOfelements];

        System.out.println("Islemi durdurmak icin 'q' basiniz...");

        for (int i = 0; i < stdNames.length; i++) {

            System.out.println((i + 1) + " . ogrencinin ismini giriniz...");
            String name = input.next();
            if (name.equalsIgnoreCase("q")) {
                break;
            } else {
                stdNames[i] = name;
            }

        }
        System.out.println(Arrays.toString(stdNames));

    }
}
