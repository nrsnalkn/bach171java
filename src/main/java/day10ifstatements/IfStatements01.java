package day10ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //Ornek : Verilen bir sayinin pozitif negatif yada notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin ...");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("pozitif");

        } else if (num < 0) {
            System.out.println("negatif..");

        } else {
            System.out.println("notr");
        }
    }
}
