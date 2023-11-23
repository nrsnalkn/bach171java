package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
       /*
        1) Lambda "Functional Programming"dir, digeri "Structured Programming"
        2) "Functional Programming" te "Ne yapilacak" (What to do) uzerine yogunlasilir
           "Structured Programming" te "Nasil yapilacak" (How to do) uzerine yogunlasilir
         */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printElements1(nums);//12 9 131 14 9 10 4 12 15
        System.out.println();
        printElements2(nums);//12 9 131 14 9 10 4 12 15
        System.out.println();
        printEvenElements1(nums);//12 14 10 4 12
        System.out.println();
        printEvenElements2(nums);//12 14 10 4 12
        System.out.println();
        printSquareOfOddElements(nums);//81 17161 81 225
        System.out.println();
        printCubeOfDistincOddElements(nums);//729 2248091 3375
        System.out.println();
        printSumOfSquaresOfDistinctevenElements(nums);//456
        System.out.println();
        printProductOfSquaresOfDistinctevenElements(nums);//45158400
        System.out.println();
        getMaxValue1(nums);//131
        System.out.println();
        getMaxValue2(nums);//131
        System.out.println();
        getMaxValue3(nums);//131
        System.out.println();
        getMaxValue4(nums);//131
        System.out.println();
        getMinValue(nums);//4

    }

    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Structured == Yapisal)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");

        }


    }

    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional Programming)
    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));


    }

    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Structured == Yapisal)
    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }

    }

    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional Programming)
    public static void printEvenElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));

    }

    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printSquareOfOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 1).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistincOddElements(List<Integer> nums) {
        nums.stream().
                distinct().
                filter(t -> t % 2 == 1).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));

    }

    //7)Bir list'teki "tekrarsiz" "CIFT "
    // ELEMANLARIN "karelerinin" "toplamını" hesaplayan method oluşturun
    public static void printSumOfSquaresOfDistinctevenElements(List<Integer> nums) {
        Integer sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }

    //8)Bir list'teki "tekrarsiz" "CIFT "
    // ELEMANLARIN "karelerinin" "carpimi" hesaplayan method oluşturun

    public static void printProductOfSquaresOfDistinctevenElements(List<Integer> nums) {
        Integer product = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(product);

    }
    //9)Verilen list deki maksimum deger bumak icin bir method olusturun

    //1.  yol
    public static void getMaxValue1(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    //2.yol
    public static void getMaxValue2(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    //3. yol
    public static void getMaxValue3(List<Integer> nums) {

        int max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max);

    }

    //4.yol
    public static void getMaxValue4(List<Integer> nums) {

        int max = nums.stream().distinct().sorted().reduce(Math::max).get();
        System.out.println(max);

    }
    //10) Veilen List teki minumum degeri yaziniz
    public static void getMinValue(List<Integer> nums) {

        int min = nums.stream().distinct().sorted().reduce(Math::min).get();
        System.out.println(min);

    }

}





/*
        >map() methodu stream de bulunana her bir elemanda degisiklik yapilacagi zaman kullanilir.
        >filter() methodu stream icerisinde belirli datalari cekmek icin kullanilir
        >stream() methodu listteki elemanlari akis haline getirir. Hafizada yer tutmaz.
        >forEach() methodu streamdeki her elemani alip yazdirmaya yarar.
        >distinct() methodu stream deki elemanlarin tekrarsiz olanlarak kullanmaya yarar. stream den sonra kullanmak
            Java'yi yormamak icin best practice.
        >reduce() streamde coklu datanin tek bir dataya indirgenecegi (reduction) zaman kullanilir.
            identity ==> etkisiz eleman yazilir
         */
