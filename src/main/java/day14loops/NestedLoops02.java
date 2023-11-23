package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {
        /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
              |     X X X X X  // satir
            sutun   X X X X X
                    X X X X X
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Satir (row) sayisini giriniz..");
        int row = input.nextInt();

        System.out.println("Sutun (colum) sayisini giriniz..");
        int colum = input.nextInt();

        for (int i = 1; i <= row; i++) {// distaki loop satirlar icin satir sayisi katar calisir

            for (int k = 1; k <= colum; k++) { // icteki loop yan yana  yazdigindan sutunlar icin stun sayisi kadar calisir
                System.out.print("x ");
            }
            System.out.println(); // satir yan yana yazdiriltiktan sonra pointer i bir sonraki satira almak icin
        }
    }
}
