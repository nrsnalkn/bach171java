package replit;

import java.util.Scanner;

public class Eng01If_Swıtch_Ternary_StrıngMeth {
    public static void main(String[] args) {
        /*
        Ask user to their weight and height and type a program with calculates mass index

                * HINT : Body Mass Index = Weight (kg) / Square of height (m)

                Then give a message to user as following:

                If BMI is less than 18.5 , you are weak
                If BMI is between 18.5 and 25 , your weight is ideal
                If BMI is between 25 and 30, you are fat
                If BMI is more than or equal to 30, obese

                EXAMPLE :

                INPUT:

                Weight : 71

                Height : 1.72

                OUTPUT :

                Your BMI is  : 23.99945916711736
                Your weight is ideal
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight,Please...");
        double weight = input.nextDouble();
        System.out.println("Enter your height,Please...");
        double height = input.nextDouble();

        double bMI = weight /  (height*height);
        System.out.println(bMI);

        if (bMI<0){
            System.out.println("Enter a valid value, Please...");
        } else if ( bMI<18.5) {
            System.out.println("you are weak");

        } else if (bMI> 18.4 && bMI <25) {
            System.out.println("your weight is ideal");

        }
        else if (bMI>24 && bMI <30) {
            System.out.println("you are fat");

        }
        else {
            System.out.println("obese");
        }


    }
}
