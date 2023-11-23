package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
            
            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ülke adı gırınız");
        String ulkeAdi = input.next();

        switch (ulkeAdi.toLowerCase()) {
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "france":
                System.out.println("FR");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            default:
                System.out.println("Bu ulke tanimli degildir");
        }
        
    }
}