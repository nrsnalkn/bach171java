package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        //ornek1 : ekrana 5 kere "Hi" yazdirin
        System.out.println("Hi...");
        System.out.println("Hi...");
        System.out.println("Hi...");
        System.out.println("Hi...");
        System.out.println("Hi...");



        /*
         Code Standarts
         1) Tekrar (Repetition) olmamalidir
         2) Dynamic olmalidir
         3) Tamir (Fix) ve update kolay yapilabilmelidir.
         /*


        //2.yol
        //Ayni adimlari tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir
        //Dort tane loop var a) for-loop 2) while loop 3) do while loop 4)for each loop

        a) for-loop
        for (Baslangic Degeri ; Loop calisma sarti ; i++){
            //calisacak kodlar

        }
*/
        System.out.println("************************");
     //i=i+i  / i+=1  /i++
        //Baslangic degeri      ;  Loop un calisma  sarti   ; Artirma/Eksiltme
        for ( int i = 1         ;    i<6                    ; i++               ){
            System.out.println("Hi");

        }

        //ornek 2: 11 den 14 kadar tum sayilari ekrana yazdiran kodu yaziniz

        for (int i=11 ;i<15 ; i++){
            System.out.print(i + " ");
        }

        //ornek3 : 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz

        for (int i =40  ; i >22 ; i--){
            if (i%2==0){
                System.out.print(i + " ");
            }

        }
       /*  dinamik olmaz her zaman cift sayilari yazdirmaz tek sayi ile baslayinca tek sayilari yazdirir
        for (int i =40  ; i >22 ; i-=2){

                System.out.println(i);
        }
*/

        //ornek 4 : 18 ten 56 ya kadar tum tek sayilari yazdiran kod yaziniz
        System.out.println();
        for (int i =18 ; i < 57 ; i++){
            if (i%2!=0){
                System.out.print(i + " ");

            }
        }
    }

}
