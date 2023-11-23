package replit;

import java.util.Scanner;

public class Eng01forwhile01 {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character, then check how many times
        the character is repeated in the name using loops in the name

        e.g:

        char ch1= 'a' ;

        String name =“John came late";

        Expected Output: Number of a = 2
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str = input.nextLine();
        System.out.println("Please enter a character");
        char chr = input.nextLine().charAt(0);
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                counter++;
            }

        }
        System.out.println("Number of " + chr + " = " + counter);

    }
}
