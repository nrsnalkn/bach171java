package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
    /*
   Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin

    */

        List<String> mylist = new ArrayList<>();
        mylist.add("A");
        mylist.add("H");
        mylist.add("J");
        Scanner input = new Scanner(System.in);
        int counter =0;
        int can =3;

        do {
            if (counter==can){
                System.out.println("Game Over!!");
                break;
            }
            System.out.println("Please enter a letter...");
            String letter = input.next().toUpperCase().substring(0, 1); //string class tercih edikir cunku string class method acisindan zengindir

            if (mylist.contains(letter)) {

                mylist.set(mylist.indexOf(letter), "Buldum");
            } else {
                mylist.add(letter);
            }
            System.out.println(mylist);
            counter++;


        } while (true);


    }
}