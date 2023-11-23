package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        //kalibini olusturalim
       /* for (baslangic degeri ; loop calisma kurali  ; artirma / azaltma ){
       calisacak kodlar


        }*/

    /* while loop calisma prensibi
        baslangic degeri
                while(loop calisma kurali ){
                    calisacak kodlar
                            artirma/azaltma
                }
        */
        //Ornek 1: 3 ten 6 ya kadar tam satiyilari console yazdirin
        //1.way
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");

        }
        System.out.println();//pointeri asagi aliyor sadece
        //2.way

        int i = 3;
        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //example 2: 23 ten 12 ye kadar cift sayilari console yazdiriniz

        int k = 23;
        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();

        //example 3: 6 tan 19 kadar olan tum tek sayilari console yazdirin

        int m = 6;
        while (m < 20) {
            if (m % 2 != 0) {
                System.out.print(m + " ");
            }
            m++;
        }
        System.out.println();


    }
}
