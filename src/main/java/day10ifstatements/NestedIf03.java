package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
         /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Password girinizi...");
        String password = input.nextLine();

        if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
            if (password.charAt(0) == 'A') {
                System.out.println("gecerli password");

            } else {
                System.out.println("gecersiz password cunku ilk harf 'A' degil");

            }

        } else if (password.charAt(0) >= 'a' && password.charAt(0) <= 'z') {
            if (password.charAt(0) == 'z') {
                System.out.println("gecerli password");
            } else {
                System.out.println("gecersiz password cunki ilk harf 'z' degil");
            }

        } else {
            System.out.println("ilk character harf olmali");
        }


    }
}
