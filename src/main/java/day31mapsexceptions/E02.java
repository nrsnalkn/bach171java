package day31mapsexceptions;

public class E02 {
    public static void main(String[] args) {
        String s = "1234";
        convertStringToInt(s);

        String t = "123a";
        convertStringToInt(t);
    }
    // icinde rakamlar disinda character olan bir stringi sayiya cevirdigimizde NumberFormatException aliriz

    public static void convertStringToInt(String s) {
        try {
            Integer intS = Integer.valueOf(s);
            System.out.println(intS + 1);
        } catch (NumberFormatException e){
            System.out.println("Bir string in sayiya donusturulmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());//teknik mesaj
        }



    }
}
