package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //kullanicidan alinan bir sayinin tek mi çift mi oldugunu console yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        //1.Yol
        if(num%2==0){
            System.out.println("Cift Sayi...");
        }
        if (num%2!=0){
            System.out.println("Tek sayi...");
        }
        //2. yol
        if (num%2==0){
            System.out.println(" çift sayı");
        }else {
            System.out.println("tek sayı");
        }

    }
}
