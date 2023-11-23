package day15loops;

public class DowhileLoop01 {
    public static void main(String[] args) {
         /* while loop calisma prensibi
        baslangic degeri
                while(loop calisma kurali ){
                    calisacak kodlar
                            artirma/azaltma
                }
        */
        /*
        baslangic degeri
                do{
                    calisacak kodlar
                    artirma/azaltma
                } while (loop calisma kurali ); */

        //Example 1: 5 ten 3 e kadar tamsayilari console yazdirin

        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i>2);

        //1) while loop

        int a = 1;
        while (a<1){
            System.out.println("Sen bir while loopsun");
            a++;
        }

        //while loop ta zero execution mumkundur
        //2)do while loop

        int b =1;
        do {
            System.out.println("Sen bir do while loopsun");
            b++;
        } while (b<1);
        //do while kullandigimizda loop en az birkez calisir zero execution mumkun degildir


    }
}
