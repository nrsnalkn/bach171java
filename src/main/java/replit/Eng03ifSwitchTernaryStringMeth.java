package replit;

import java.util.Scanner;

public class Eng03ifSwitchTernaryStringMeth {
    public static void main(String[] args) {
        /*
            Write a Java program to compute and print sum of two given numbers (more than or equal to zero).

            If given integers or the sum have more than 10 digits, print "overflow".
            EXAMPLE:

            INPUT      :
            Input two integers:

            25
            46
            OUTPUT :

            Sum of the numbers: 71
         */


        int num1 = 25;
        int num2 = 46;
        int sum = num1 + num2;

        if (sum > 999999999) {
            System.out.println("overflow");
        } else if (num1 >= 0 && num2 >= 0) {
            System.out.println(sum);
        } else {
            System.out.println("please valid value enter");
        }


    }


    }











