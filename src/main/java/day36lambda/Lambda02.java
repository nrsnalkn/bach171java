package day36lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {

        //example1: verilen text file icindeki texti console yazdirin code yaziniz
        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //example2: Verilen text file icindeki texti buyuk harflerle console yazdiriniz
        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).map(t -> t.toUpperCase()).forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "get" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean result1 = Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).anyMatch(t -> t.contains("get"));
        System.out.println(result1);

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.

        List<String> words = Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t -> t.replaceAll("\\p{Punct}", "").split(" ")).
                flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(words);

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long characters = Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t -> t.replaceAll("[^a-zA-Z]", "")).map(t -> t.split("")).flatMap(Arrays::stream).count();
        System.out.println(characters);

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        // icinde return eden kodu yaziniz.
        List<String> letters = Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t -> t.replaceAll("[^a-zA-Z]", "")).map(t -> t.split("")).
                flatMap(Arrays::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(letters);
    }
}
