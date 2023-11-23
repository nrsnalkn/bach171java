package day20statikkeywordconstructors;

public class Car {

  /*
        Constructor nedir?
        Class'dan object uretmemize yarayan code blocklaridir.

        Class olusturdugumuzda java bize otomatik olarak bir constructor verir.Ama bu constructor gozle gorulmez,
        gozle gorulmeyen otomatik olarak java tarafindan verilen bu constructorlara default constructor denir

        default constructor ===>    " Car(){    } " seklindedir
         Bir class ta farkli parametreleri kullanarak istediginiz
         kadar cons.olusturabiliriz.
         farkli cons. sayesinde bir classdan farkli farkli objeler olusturabiliriz.

         1)Constructor nasil olusturulur.
         Acces modufier + class ismi +() +{}
         2)Method ile constructor arasindaki farklar nelerdir ?
         a- Methodlarda return type olur
         constructorlarda return type olmaz.
         b- Methodlar yaptiklari ise gore isimlendirilirler.
         Constructorlar her zaman class ismi ile isimlendirilirler
         c- Methodlar aksiyon yapmak icin olusturulur .
         Constructorlar object olusturmak icindir
         d- Method isimleri kucuk harf ile baslar.
         Constructor class ismi ile ayni oldugu icin herzman byuk harf ile baslar.

         3)Parametreli Constructorlar olusturarakayni classdan farkli ozelliklere sahip objeler olusturabiliriz.
 */

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car (String make , String model , int year, boolean hybrid){
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;

    }
    public Car(String make, String model){
        this.make =make;
        this.model =model;

    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
