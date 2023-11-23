package day31mapsexceptions;

public class E04 {
    public static void main(String[] args) {
        String arr[] = {"J", "A", "V", "A"};
        getElemanFromArray(arr,1);//A
        getElemanFromArray(arr,5);//A
    }
    //Arraylerde olmayan bir index kullanildiginda java ArrayIndexOutOfBoundsException atar
    public  static void getElemanFromArray(String[] s, int idx){

        try {
            String el = s[idx];
            System.out.println(el);}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
            System.out.println(e.getCause());//null
        }

    }
}
