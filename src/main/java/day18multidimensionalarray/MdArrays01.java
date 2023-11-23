package day18multidimensionalarray;// cok boyutlu array

import java.util.Arrays;

public class MdArrays01 {
    public static void main(String[] args) {
        //Bir array in elemanlari Array ise bu Arrayler Multidimenionsal Arraylerdir
        //Multidimenionsal Array nasil olusturulur

       // int a[][] = {{5, 12}, {81, 45}, {123, 0}};
        int a [][] = new int[3][2]; // ilk outer(distaki) array ikinci inner(icteki) array
         // Multidimenionsal Arraylere eleman nasil eklenir?

        a[0][0]=5;
        a[1][1]=45;
        a[1][0]=85;
        a[2][0]=123;
        a[2][1]=0;
        a[0][1]=12;

        //multidimensionsal arrayler nasil yazdirilir
        System.out.println(Arrays.deepToString(a));
        // Multidimenionsal Arrayleri yazdirmak icin toString methodu degil deepToString() methodunu kulaniriz

        // Multidimenionsal Array icinden spesifik bir eleman nasil yazdirilir
        System.out.println(a[1][1]);

        //Multidimenionsal Array icindeki bir array nasil yazdirilir
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[1]));//[85, 45]

        //kisa yoldan multidimenionsal array nasil olusturulur
        String students[][] = {{"Ali","Kemal"}, {"Cemal"}, {"Ayhan","Beyhan","Seyhan"}, {"Ceyhan","Kayahan"}};
        //example 1: yukaridaki studens arrayinde de toplam kac isim oldugunu bulun

        int sum = 0;

        for (String[] w : students) {
            sum = sum + w.length;

        }
        System.out.println(sum);




    }
}
