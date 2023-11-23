package day16arraysforeachloops;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //example 1: Integer bir array olusturunuz, icine 6 tane eleman yerlestiriniz.
        // bu elemanlarin en kucu ile en buyugunun topalminini ekrana yazdiriniz

        int age[] = new int[6];
        age[0] = 20;
        age[1] = 23;
        age[2] = 19;
        age[3] = 44;
        age[4] = 15;
        age[5] = 32;
        System.out.println(Arrays.toString(age)); //[20, 23, 19, 44, 15, 32]

        //1.yol
        //sort() methodu array deki elemanlari kucukten buyuge dogru siralar

        Arrays.sort(age);
        System.out.println(Arrays.toString(age)); //[15, 19, 20, 23, 32, 44]

        System.out.println(age[0] + age[age.length - 1]);

        //2. yol
        int minimum = age[0];
        int maximum = age[0];

        for (int w : age) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum);

        System.out.println(maximum);

        System.out.println( "Max + min = " + (maximum + minimum));

        //example 2: String bir array olusturunuz 6 tane elemen ekleyiniz yellow dan onceki elemenleri yazdiriniz

        String colors [] = new String[6];

        colors [0] ="Red";
        colors [1] ="Orange";
        colors [2] ="Blue";
        colors [3] ="Yellow";
        colors [4] ="Green";
        colors [5] ="Brown";
        System.out.println(Arrays.toString(colors)); //[Red, Orange, Blue, Yellow, Green, Brown]

        for (String w : colors){
            if(w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }

    }
}
