package day20statikkeywordconstructors.day28interfacecollections;
public interface Ac  {

    public abstract void cool();
    void  run();
   int price =2000;

    /*
    1) Bir interface'i bir classin parenti yapmak icin "implements" keywordunu kullaniriz
    2) java parentlar class oldugunda multiple parent a musaade etmez ama biz bazen
    multiple parent a ihtiyac duyariz
    Bu ihtiyaci g idermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir class icin coklu interface parent olusturulabilir
    3) interfacelerin icine conceret method konulamaz, cunku concrete methodlarda body vardir ve
    body o methodun isi nasil yapacagini belirtir. isin nasil yapilacagi bir cok detay icerir ve bu chlid
    classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyip
     nasil yapilaacgini childa birakirsaniz chil classin kafa karisikligini engellemis olursunuz
    4) interfacelerdeki tum methodlar otomatik olara public dir, abstracttir, static degildir
    5)interfaceler concrete method iceremezler dolayisyal interface icindeki hicbirsey istege bagli degildir
    hersey child classlar icin mecburidir. Bu yuzden interfacelere" to-do list " de denir
     6)Coklu interface parentlarin herbirinin icine ayni isimli methodlar koyabiliriz
    Mesela Ac nin, Engine'in ve Security nin iclerine "run()" metodu koymak gibi
    Child class herhangi birini override ettiginde hepsini override etmis gibi olur sonrada
    body yi Child class da yazarak uygulamasini yapmis olur
    7) a)interface lerdeki tum varaibler otomatik olarak defaoult finaldir.
    Bu yuzden interfaca icindeki varaible olusturdugumuzda mutlaka deger atamasi yapmasiniz.
    bilindigi gibi final varaible larin degeri degistirilemez
       b)interface lerdeki tum varaibler otomatik olarak publictir
       c)interface lerdeki tum varaibler otomatik olarak statictir.
       =>dolayisi ile interfacelerde varaible cagiriken interface adini kullanarak cagiririz.
       Bu hem static varaible olmanin geregidir hemde okunurlugu artirir.
    8) Normalde 'interface " icine concrete method konulamaz ama bazi ozel durumlarda
      "concrete method" koymamiz gerekirse default keyword kullanarak kullanabiliriz
       static keyword unude kullanarak interface icine concrete method koyabiliriz
    9) "default" keyword unu kullanartak olusturdugunuz"concrete method" lara interface
      in child claslarindan object olusturarak ulasabilirsiniz
       "Static" keyword unu kullanarak olusturdugumuz concrete methodlara class adi ila ulasabiliriz.
    10) interface lerden object olusturulamaz interfacelerin cons yoktur
    11)
         Child           Parent             keyword
         class           class     ==>      extends
         interface      interface  ==>      extends
         class          interface  ==>      implements
         interface      class      ==>      OLAMAZ

         Ayni ise extends farkli ise implements kullaniriz ve interface concrete classin child i olamaz



         Abstract class ile interface arasindaki farklar nelerdir?

         1) Abstract  classlar hem abstract hemde concrete methodlar icerebilir fakat interfaceler sadece abstract methodlar icerir
         ama interface lerde default ve static keywordlarini kullanarak concrete method uretebiliriz
         2) Abstract classlar multiple inheritancei desteklemez. ama interface ler destekler
         3) Abstract class icinde herturlu varaible olusturulabilir interface icindeki varaibler public static ve final olmak zorundadir
         4) interface Clasin child i olamaz ama abstract class classin childi olabilir
         5) Abstract classlarda constructor vardir ama object uretemezler interfacelerde constructor yoktur bu yuzden object uretilemez





      */
}