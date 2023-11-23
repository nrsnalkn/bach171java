package day25inheritance;

public class Animal {
    //Inheritance ==> miras alma
    /*
    Ozellikleri bir classtan diger classlara alan bir kavramdir
    Mesela siz bir class olusturmak istiyorsunuz ama daha once olusturulmus bir class
     sizin istediginiz ozelliklerin cogunu kapsiyor. O zaman yeni olusturdugunuz classi ozelliklerini kullanmak
     istediginiz class'a child yaparsiniz

     Inheritance'in faydalari
     1) Code tekrarlarindan kurtuluruz
     2) Code tamiri(maintenance)  kolay olur
     3) Child classlari daha atomic yapmis oluruz

     => Bir classi baska bir classin child classi yapmak icin
     extends keywordu kullanilir. Ilk yazilan child, ikinci yazilan class
     parent olur, parent class'a super class da denir

     => child class objectleri parent class tan method ve variable lari kullanabilirler
     => Parent class objectleri child classtan method ve variablelari kullanamazlar

     =>Javada bir classin sadece bir parent i olabilr coklu parent a "Multiple Inhertance" denir
     tekli parent a "single inheritance" denir. Java"multiple inheritance desteklemez.
     Java "Single inheritance " i destekler

     =>Apartman seklindeki inheritance yapisina " Multilevel inheritance " denir
     Java multilevel inheritance yapisini destekler

     =>Object class her classin parent dir javada object class haric her classin parenti vardir
     Javada parenti olmayan tek class object classtir

     =>java da parent tan childe olan iliskilere " has a relation Ship" denir
     java da child dan perant te  olan iliskilere " is a relation Ship" denir



     */

    public void eat() {
        System.out.println("Animals eat..");
    }

    public void drink() {
        System.out.println("Animals drink..");
    }




}
