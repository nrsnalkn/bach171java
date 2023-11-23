package day22arraylistsdatetime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Bir Listteki tekrarsiz elemanlari console yazdirin kodu yaziniz
        List<Double> price = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0); // dooble bir list


        for (double w : price) {
            if (price.indexOf(w) == price.lastIndexOf(w)) {
                System.out.println(w);
            }
        }


        //Example 2: Bir Liste tekrarli  eleman olup olmadigini bulan code yaziniz

        List<Integer> height = List.of(3, 13, 3);
        int counter = 0;

        for (Integer w : height) {
            if (height.indexOf(w) != height.lastIndexOf(w)) {
                counter++;
                break;
            }

        }
        if (counter == 0) {
            System.out.println("All elements are unique in the list");
        } else {
            System.out.println("At least one element is not unique in the list");
        }





    }
}
