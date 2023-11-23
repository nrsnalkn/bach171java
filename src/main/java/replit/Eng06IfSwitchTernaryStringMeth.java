package replit;

import java.util.Scanner;

public class Eng06IfSwitchTernaryStringMeth {
    public static void main(String[] args) {
        /*
                 Ask user to type a name,

                the length of name should be 3.

                Then check if the name has same characters.

                If the String has same characters

                Print “String has duplicate characters”
                Else

                Print “String has unique characters”

                Please use ternary.


                Input :

                ala

                OutPut:

                String has duplicate characters
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a name..");
        String name = input.next();
        int counter = 0;

        if (name.length() == 3) {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (name.indexOf(ch) != name.lastIndexOf(ch)) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("String has unique characters");
            } else {
                System.out.println("String has duplicate characters");
            }
        }
        else {
            System.out.println("String very long please try again");
        }


    }
}
