package day01variables01;

public class Variable01 {
    public static void main(String[] args) {
        //java bu satiri okumaz Kendimize veya baskalarina aciklamadir

        /*
        java bu satirlari okumaz
         */

        //Variable  nasil olusturulur
        //Data Type  +  Variable name + Atama Operator (Assignment Operatoru) + variable degeri + noktali virgül

        int age = 5;


        // java cumlesi => statemnt
        // Dİlbilgisindeki nokla ne ise javada ";" ayni seydir , yani statenmt  in bittigini gösterir
        // Eger varaible declaration yapar, Assigment yapmazsanız java kendi default degerlerini koyar
        //Default deger sayilar icin sifirdir
        // Javada "=" assiginment operator ve java operatoru gordugu zaman once sag tarafi calıstirir
        //ve sagdaki degeri alir kutuya koyar
        //Javada esittir demek ==> "=="     Matematikte "=" , java da "=="
        //Data type + varaibleName ==> Varaible declaration
        // assignment operator (=) + Variable degeri ==> Assignment

        /*
        Java da temelde iki tip data vardir ;
        1) primitive data type
        char, boolean, byte, short, int, long, float, dauble

        2) non-primitive data type
            String örnektir istedigimiz kadar olusturabiliriz

         */

        //Örnek 1) Ogrenci icin varible olusturup deger olarak Ali Can atayiniz

        String ogrenciName = "Ali Can";

        //String'lere verilen degerler daima cift tirnak icinde olmalidir
        //String ler icin default value (==>varsayilan deger) "null" dir
        /*
        *String variable olusturdugumuzda cogu zaman ona bir deger atari. Atama yapmazsak java o varibale icin varsayilan
        deger olarak null koyar
        *null demek 0 demek degildir, 0 da coding te bir degerdir, null ise hiclik demektir
        * null demek icinde variable veya method bulunmayan bos bir objedir
        * {}==>eleman yok  {0}==> elemani sifir
         */

        //char data type:
        //Tek karakterler icin kullanilir. Sayi, Sembol, Harf fark etmez
        //Ornegin ==> A, x, 4, ?
        //Ornek 2) char data type inda bir ismin ilk harfi olarak bir variable olusturpu deger atayiniz

        char isminIlkHarfi = 'A';

        //boolean data type:
        //booleanlar sadece iki farkli deger alir true(dogru) ve false(yanlis)
        // isinlendirme yapilirken basina "is" konulur isimlendirme ingilizce yapilirsa
        //Ornek3) boolean data type inda emeklimisin sorusu icin bir variable olusturup false degerini atayin


        boolean isRetired = false;

        //byte data type;
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte : -128 den baslar +127(dahil) tamsayi degerleri icin kullanilir
        //Ornek4: byte data type inda ogrenci yasi icin bir variable olusturun ve deger atayin

        byte ogrenciYas = 12;

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short : -32768 den baslar +32767(dahil) tamsayi degerleri icin kullanilir
        //Ornek5: Site nufusu icin bir varaible olusturun ve deger atayin

        short siteNufusu = 1300;
        //int data type
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int : -2,147,483,648 den baslar +2,147,483,647(dahil) tamsayi degerleri icin kullanilir
        //Ornek5: Ulke nufuslari icin bir varaible olusturun ve deger atayin
        int ulkeNufusu = 1234567890;

        //long data type
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long : -9,223,372,036,854,775,808 den baslar +9,223,372,036,854,775,808(dahil) tamsayi degerleri icin kullanilir
        //Ornek5: Insan vucudundaki hucre sayisi icin bir varaible olusturun ve deger atayin
        long cellNumburInHumanBody = 789789789789789794L;

        //Note: Bir deger long ise sonuna "L"(tavsiye edilir) veya "l" konulur
        //Eger long a atadiginiz deger int lerin araliginda ise sonuna "L" koymaya gerek yok
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder

        long weightOfSun = 1234561112;

        //float data type: 4 byte yer kaplar
        //float virgullu sayilar (Decimal Number => ondalikli sayilar) icin kullanilir(Fiyatlandirmalar - 12.99)


        //Java ondalikli sayilari otomatik olarak "double " kabul eder.
        //Siz data type ini float yazarsaniz hata alirsiniz, float olmasinda israr ediyorsaniz sonuna "F","f" koymalisiniz
        //4 byte yer kaplar
        // Ornek 8:  Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturun.
        float shirtPrice = 12.99f;
        float shoesPrice = 15.99f;

        //double data type ;
        //double memory de 8 byte yer kaplar, ondalikli kisim icin daha fazla rakam alir
        //ondalikli sayilar icin kullanilir

        //Ornek9: Hücre agirligi ve Amip'in agirligi icin variable olusturun

        double weigthCell = 0.0000000000000000000113;
        double weigthAmip = 0.0000000000000000000015;

        //Ornek 10: Ogrenci notlari icin iki adet variable olusturup toplamlarini ekrana yazdırınız

        byte ogrenciNotu1 = 60;
        byte ogrenciNotu2 = 85;

        System.out.println("Ögrenci Notlar Toplamı = " + (ogrenciNotu1 + ogrenciNotu2));

        //homework
        /*
        1)3 farkli data turunda variable olusturun ve bunlari farkli satirlarda yazdirin

        2)ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
        3) iki tamsayi turunde variabel olusturup toplamini  yazdirin.
        */
        //    1)3 farkli data turunda variable olusturun ve bunlari farkli satirlarda yazdirin
        byte yas =55;
        boolean isinVarMı = false;
        double kilo = 65.78;
























    }

}
