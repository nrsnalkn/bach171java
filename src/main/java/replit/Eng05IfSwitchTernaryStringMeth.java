package replit;

import java.util.Scanner;

public class Eng05IfSwitchTernaryStringMeth {
    public static void main(String[] args) {
            /*
    Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)

        Sample:

          INPUT:

        Input a month number: 2

        Input a year: 2016

          OUTPUT  :

        February 2016 has 29 days

     */

        Scanner input = new Scanner(System.in);
        System.out.println("month number enter");
        int month = input.nextInt();
        System.out.println("one year enter...");
        int year = input.nextInt();
        int daysNum;

        switch (month) {
            case 1:
                System.out.println("January");

            case 3:
                System.out.println("March");

            case 5:
                System.out.println("May");

            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");

            case 10:
                System.out.println("Octeber");

            case 12:
                System.out.println("Desember");
                daysNum = 31;
                System.out.println(" " + daysNum + " days");
                break;

            case 4:
                System.out.println("April");

            case 6:
                System.out.println("June");

            case 9:
                System.out.println("September");

            case 11:
                System.out.println("November");
                daysNum = 30;
                System.out.println(" " + daysNum + " days");
                break;
            case 2:

                if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                    daysNum = 28;
                    //System.out.println("");
                    System.out.println("February " +year + " has "+ daysNum + " days" + " Leak Year");
                } else {
                    daysNum = 29;
                    System.out.println(" " + year +" " + daysNum + " days");
                }
                break;
            default:
                System.out.println("Invalid month!");

        }


    }
}



