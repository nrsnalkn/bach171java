package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda02 {
    public static void main(String[] args) {
        List<String> meyve = new ArrayList<>(Arrays.asList("elma", "portakal", "uzum", "cilek", "greyfurt", "nar",
                "mandalina", "armut", "elma", "keciboynuzu", "elma"));
        // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım

        ilkHarfiEveyaC(meyve);
        System.out.println("\n ****************");
        elemanlarinBasinaSonunaYildizEkleme(meyve);
        System.out.println("\n ****************");
        icindeEHarfiOlanlar(meyve);
        System.out.println("\n ****************");
        lHarfleriniSil(meyve);
        System.out.println("\n ****************");
        karakterSayisinaGoreKucuktenBuyugeLambdaExpression(meyve);
        System.out.println("\n ****************");
        karakterSayisinaGoreBuyuktenKucugeLambdaExpression(meyve);
        System.out.println("\n ****************");
    }

    public static void ilkHarfiEveyaC(List<String> meyve) {
        meyve.stream().filter(t -> t.startsWith("e") || t.startsWith("c")).forEach(Utils::yazdir);
    }

    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void elemanlarinBasinaSonunaYildizEkleme(List<String> meyve) {
        meyve.stream().map(t -> "*" + t + "*").forEach(Utils::yazdir);
    }

    // SORU3 : List elemanlarının icinde 'e' harfi olanları yazdırın
    public static void icindeEHarfiOlanlar(List<String> meyve) {
        meyve.stream().filter(t -> t.contains("e")).forEach(Utils::yazdir);
    }

    // SORU4 : List elemanlarındaki 'l' harflerini silip yazdırınız
    public static void lHarfleriniSil(List<String> meyve) {
        meyve.stream().map(t -> t.replace("l", "")).forEach(Utils::yazdir);
    }
    // SORU5 : List elemanlarini, Lambda Expression kullanarak
// karakter sayisina göre kucukten buyuge dogru sıralayarak yazdırını

    public static void karakterSayisinaGoreKucuktenBuyugeLambdaExpression(List<String> meyve) {
        meyve.stream().sorted(Comparator.comparing(t -> t.length())).forEach(Utils::yazdir);
        //siralamayi neye gore yapacgimizi sorted icine Comparator.comparing icine belirtiyoruz
    }
    // SORU6 : List elemanlarini, Lambda Expression kullanarak
    // karakter sayisina göre kucukten buyuge dogru sıralayarak yazdırını

    public static void karakterSayisinaGoreBuyuktenKucugeLambdaExpression(List<String> meyve) {

        meyve.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).forEach(Utils::yazdir);
        //siralamayi neye gore yapacgimizi sorted icine Comparator.comparing icine belirtiyoruz
    }
    // SORU7 : List elemanlarini, Method References kullanarak
    // karakter sayisina göre buyukten kucuge dogru sıralayarak yazdırınız

}
