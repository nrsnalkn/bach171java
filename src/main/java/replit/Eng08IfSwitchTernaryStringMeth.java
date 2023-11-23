package replit;

import java.util.Scanner;

public class Eng08IfSwitchTernaryStringMeth {
    public static void main(String[] args) {
        /*
            Ask user for a string and print a new string made of 3 copies of the last 2 letters

            The strings length will be at least 2.

             Sample:

            INPUT       : Mustafa
            OUTPUT      : fafafa
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter String...");
        String str = input.next();
        String output = "";

        if (str.length() > 1) {
            for (int i = str.length() - 2; i <= str.length() - 1; i++) {
                char ch = str.charAt(i);
                output = output + ch;
            }


            System.out.println(output + output + output);
        }
    }

}
