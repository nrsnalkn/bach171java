package day24stringbuilder;

public class Student {
    public static void main(String[] args) {
        /*
        Access Modifier
        1)public
        2)prodected
        3)defoult (Access modifier i default yapmak icin access modifier yazmayiz)
        4)private

        note access modifier i genisten dara dogru siralayiniz
        -public
        -prodected
        -default
        -private
        Note : public ==> public olanlar her class tan ulaasilabilinir
               prodected ==> olanlar ayni baska package lardan kullanilmaz
               ama baska package da child class icinden kullanilabilir
               default ==>olanlar baska package den kullanilamazlar
               private ==> olanlar sadece olusturulduklari class icinde kullanilabilirler
         Note : "protected ile default arasindaki farki soyleyiniz?
                 protected olanlar baska package den kullanilamaz ancak child class icinde kullanilabilirler
                 default olanlar baska package larda kullanilamazlar
         */


    }

    // public olanar her class tan kullanilir
    public String stdName = "Ali Can";

    //protected olanlar baska package dan sadece child claslardan gorulur
    protected String address = " Istanbul";

    //default olanlar baska package den kullanilamazlar
    String email = "alican@gmail.com";

    //private olanlar sade olusturulduklari classtan kullanilirlar
    private String ssnId = "1234567789";
}
