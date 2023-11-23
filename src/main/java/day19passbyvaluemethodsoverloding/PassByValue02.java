package day19passbyvaluemethodsoverloding;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";

        System.out.println(addTitle("Dr", name)); //Dr Tom Hanks

        System.out.println(name);// Tom Hanks
        name = addTitle("Dr", name);
        System.out.println(name); //Dr Tom Hanks

    }

    public static String addTitle(String title, String name) {
        name = title + " " + name;
        return name;


    }
    /*

    Pass By Value:
    1) Java  "pass by value" kullanir
    2) Yani; java methodlarin orjinal degeri degistirmesine musaade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur. ve o kopyayi method a yollar
        Method kopya deger üzerinde degisiklik yapar, boylece orjinal deger korunmus olur
    4) java esnek bir dildir, istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
    Bakiniz line 10
    Pass By Reference:
    1) Pass by Reference da method a reference yollanir
    2) Reference adres demektir. Adress yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistir.
    Bu yuzden "C#" gibi Pass By Reference kullanan dillerde method variable in orjinal degerini degistirir.
 */

}
