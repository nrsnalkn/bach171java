package day19passbyvaluemethodsoverloding;

public class PassByValue01 {
    public static void main(String[] args) {
        //Note: Java "pass by value" sayesinde variable larin orjinal degerlerin korur
        int shirtPrice = 100;

        //java methoda gonderirken orjinal degeri degil, kopyasini gonderir ve degisen deger kopya deger olur
        System.out.println(discount("student", shirtPrice));//90
        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println(discount("senior", shirtPrice));//95

        //normalde indirim yaptik discount methodu ile ama buradaki deger hala orjinal
        System.out.println(shirtPrice);//100

        shirtPrice = discount("veteran", shirtPrice);
        System.out.println("shirtprice kampanya " + shirtPrice);


    }

    //Discount Methodunu olusturalim
    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
                price = price;
        }
        return price;
    }

   /*
    1) Method Overloading yaparken ismi degistirilmez.
    2) Method Overloading yaparken parametreler degistirilir
        a) Parametreleri degistirirken , parametrelerin data type lari degistirilebilir
        b) Parametreler degistirirken, parametrelerin sayisi degistirilebilir
        c) Parametre degistirirken, parametrelerin data typelari farkli ise yerleri degistirilebilir
    3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir
    bu yüzden ismi ve parametre "Method signature" olarak adlandirilir.

    4) Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur
    Method Overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
    Method Overloading olustururken method u static yada non-static yapmanin hicbir etkisi yoktur
    Method Overloading olustururken bodyi degistirmenin hicbir etkisi yoktur

    5) "private" methodlar overload edilebilir. Cunku method overloading sadece bir class icinde olur
    private olmak ise baska classlara gidildiginde problem olusturur.

    6) static methodlar overload edilebilir,
    overloading yapmak icin (method ismini degistirmeden) method signature i degistiririz,
    dolayisiyla signature degistiginde yeni bir method olusturmus oluruz, bu nedenle static olmasi birseyi degistirmez
     */



}