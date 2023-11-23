package day32exceptions;

public class E03 {
    /*Throw Keyword bir methodun body si icinde istedigimiiz yerde istedigimiz
    kosullar icin , istedigimiz kadar Exception atamamizi saglar,
    Throw Keyword yazildiktan sonra bir Exception class objesi olusturulur
     */
    public static void main(String[] args) {
        try {
            printAge(-63);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }
    }
}
