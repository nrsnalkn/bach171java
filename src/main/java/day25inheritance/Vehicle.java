package day25inheritance;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle 1");


    }
    public Vehicle (int price){
        super();

        System.out.println("Vehicle 2");

    }
}
/*

     1) Child classtan bir object olusturdugunuzda Constructor en ustteki parent classtan baslatilarak alta dogru calisitirilir
     2) Child class taki constructor dan Parent class taki constructor a gidebilmek icin super() kullanilir
     3) Parent Class ta birden fazla constructor varsa istenilen constructor super() ifadesinin icine yazilan parametreler yardimi
      ile secilebilir
     4) Ayni class icindeki constructor i secmek icin this() kullanilir ,Ayni class ta birden fazla constructor varsa istenilen
     constructor this() ifadesinin parantez icine yazilan parametreler yardimi ile secilebilir
     5)super() ifadesini yazmak istege baglidir, yazmassaniz da java  sanki super() varmis gibi davaranir,
     Ama kodunuzun daha okunur kilmak icin yazmaniz tavsiye edilir
      6)super() this() ifadeleri constructor icinde ilk sirada olmalidir
     7)Bir constructor icinde super() ve this() ifadelri sadece bir kere kullanilabilir (bakiniz 6. kural)
     8)Inheritence da varaible lar ve methodlari cagirmak icin this veya super kullanilir
        this ayni class icindeki varaible veya methodlari cagirmak icin kullanilir
        super perant  class icindeki varaible veya methodlari cagirmak icin kullanilir


 */