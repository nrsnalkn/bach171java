package day18multidimensionalarray;

public class MdArrays04 {
    public static void main(String[] args) {
        //example 1: Bir integer multi dimensional arraydeki en kucuk ve en buyuk elemanlkarin toplamini yazdirin
        int ages[][] = {{15, 4}, {12, 43, 21}}; //==>4 + 43 = 47
        int small = ages[0][0];
        int big = ages[0][0];
        for (int[] w : ages) {
            for (int k : w) {
                small = Math.min(small, k);

            }

        }
        System.out.println("En kucuk sayi = " + small);

        for (int[] w : ages) {//outer array
            for (int k : w) { // inner array
                big = Math.max(big, k);

            }
        }
        System.out.println("En buyuk sayi = " + big);
        System.out.println("En kucuk ve En buyuk sayinin toplami = " + (small + big));

    }
}
