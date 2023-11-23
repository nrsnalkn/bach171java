package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek 1: 5 ten 8 e kadar tam sayilarin toplamini veren kodu yaziniz

        //5+6+7+8 ==> 26
        int sum = 0; // toplamaya gore 0 etkisiz eleman oldugu icin sepete eklendi

        for (int i = 5; i < 9; i++) {
            sum = (sum + i);

        }
        System.out.println(sum);


        //ornek 2:  7 den 9 kadar olan tam sayilarin carpimini veren kodu yaziniz
        //7*8*9 ==> 504

        int multiply = 1; // carpmaya gore 1 etkisiz elemendir ondan sepete eklendi
        for (int i = 7; i < 10; i++) {
            multiply = multiply * i;
        }
        System.out.println(multiply);

        //ornek 3: Verilen bir tamsayinin rakamlarinin toplamini bulan kodu yaziniz
        //578 == 5+7+8 =20

        int sum2 = 0;
        int n = -578;
        n = Math.abs(n);
        for (int i = n; i > 0; i = i / 10) {
            sum2 = sum2 + i % 10;
        }
        System.out.println(sum2);

    }

}