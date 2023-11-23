package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz
        // "Pwd12?Ab"  ==> P12?A

        String s = "Pwd12?Ab" ;
        System.out.println(s);
        for (int i =0 ; i<s.length() ; i++){
           char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue; // calismaya devam et  yani kucuk harfleri pas gec gorme
            } else {
                System.out.print(ch);
            }
        }
        //note: Break ile continue arasindaki fark nedir?
        //"Break" ile  Switch parantezinin disina cikmak icin ve loop parantezinin disina cikmak icin kullanilir
        // continue keywordu bir loop taki gecerli iteration i sonlandirip sizi increment/decrement parta goturur
    }
}
