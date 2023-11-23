package replit;

import java.util.Scanner;

public class Eng02forWhile02 {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

            Input :

            30 and 40

            Expected OutPut:

            GCD for 30 and 40 = 10

            LCM for 30 and 40 = 120
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter frist integer");
        int num1 = input.nextInt();
        System.out.println("pleas enter second  integer");
        int num2 = input.nextInt();
        int LCM = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                LCM = i;
            }

        }
        System.out.println("LCM for 30 and 40= "+ LCM);

        int GCD = 0;
        int max = num1 * num2;
        for (int i = max; i > 0; i--) {
            if (i % num1 == 0 && i % num2 == 0) {
                GCD = i;
            }

        }
        System.out.println("  GCD for 30 and 40 = " + GCD);


    }
}
