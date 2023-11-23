package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        // Verilen bir string i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        //1.way
        String t = "Java";
        String ters ="";

        for (int i = t.length()-1 ; i>=0 ; i--){
          ters= ters + t.substring(i,i+1);

        }
        System.out.println(ters);


        //2.way
        String u = "Java";
        String ters2 ="";

        for (int i =u.length()-1 ; i>=0 ; i--){
        ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        //ornek 2: size verilen bir String in 'Palindrome' olup olmadigini kotrol eden kodu yaziniz
        //nalan ===> nalan
        //ey edip adanada pide ye
        //404
        //Stringi ters cevir ters hali ile karsilastir eger esit ise Palindrome yazdir

        String str ="Nalan";
        String tersStr ="";
        for (int i=str.length()-1; i>=0 ; i--){
           tersStr= tersStr + str.charAt(i);   // tersStr= tersStr + str.substring(i,i+1); yazilabilir
        }
        if (tersStr.equalsIgnoreCase(str)){

            System.out.println(tersStr+ " Palindrome");

        }
        else {
            System.out.println(tersStr + " Palindrome degildir");
        }














        
        
        
    }
}