package replit;

import java.util.Scanner;

public class Eng02If_Swittch_Ternary_StringMeth {
    public static void main(String[] args) {
        /*
      Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


            (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

            Input :

            John White 1234234534561478

            Output :

            Name : J*** W****

            CCN  : **** **** **** 1478
         */

        Scanner input = new Scanner(System.in);
        System.out.println("userName enter please...");
        String userName = input.next();
        System.out.println("surName enter please...");
        String surName = input.next();
        System.out.println("credit cart numbers enter please...");
        String creditCartNum = input.next();

        if (creditCartNum.length()!=16){
            System.out.println("Invalid credit card number");
        }
        else{

        String name = userName.substring(0,1).toUpperCase() + userName.substring(1).replaceAll("\\S", "*");


        String surName2 = surName.substring(0,1).toUpperCase() + surName.substring(1).replaceAll("\\S", "*");


        String cCN = "**** **** **** " + creditCartNum.substring(12);
        System.out.println("Name : " + name + " " + surName2 + "\nCCN : " + cCN);


    }

    }
}
