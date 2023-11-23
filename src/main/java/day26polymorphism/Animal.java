package day26polymorphism;

public class Animal {
    /*
     1) Parent Class daki methodu child class icinde ozellestirerek kullanmaya Overriding denir.
     2) Overriding de methodun parantezine, method ismine dokunulmaz,(==>method signature) degistirilmez,
         methodun body  si degistirilir
     3) private methodlar override edilemezler
     4) Child Classdaki methodun access modifieri parent Classdaki override edilmis method(Overriden Method) un
     access modifierindan dar olamaz. Aynisi olabilir yada daha genis olabilir
     5) Child class da override edilen methodun return type i ile parent taki methodun return type i arasinda IS-A iliskisi
     varsa return type degisitirilebilir
     6) Methodun return type i primitive ise overriding yaraken return type degistirilimez. Cunku return type ya ayni olur veya
     parent tan secilir, ama primitive ler arasinda parent child iliskisi olmadiginidan parent tan secmek sozkonusu olamaz
     7) Child da override edilen methodun return typei ile parenttaki methodun return typi arasinda IS-A iliskisi
     yoksa return type degisitirilemez.
     Mesela;
     Integer wrapper class ile Long wrapper class arasinda IS-A iliskisi YOKTUR. o yuzden degistirilemez
     8) Methodun return type i void ise, Overriding yaparken return type degistirilemez.
     9) "static" methodlar override edilemezler. Cunku static methodlar tum child lar icin ortak methodlardir.
     mesela bir child bir ortak methodu degistirdiginde diger childlar bundan olumsuz etkilenebilir. Bu nedenle java
     static methodlarin override edilmesine izin vermez.
     10) final methodlar override edilemezler.
        a)final keyword unu varaible ile kullanabiliriz
            =>final varaible a mutlaka deger atanmalidir.
            =>ilk atanan deger bir daha degistirilemez
        a)final keyword unu methodlarda da ile kullanabiliriz



      */
    public void eat() {

        //parenttaki override edilmis eat() methoduna "Overriden Method" denir
        System.out.println("Animal eat...");
    }

    public void drink() {
        System.out.println("Animal drink...");
    }

    public Animal create() {
        return new Animal();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;

    }

    public final double circleArea(double r) {
        return 3.1 * r * r;

    }

}
