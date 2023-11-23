package homework;

import java.util.Arrays;
import java.util.HashMap;

public class HomeWorkMap {
    public static void main(String[] args) {
        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String words = "Hello Henry!";
        //String i noktalama isaretinden kurtaralim
        words = words.replaceAll("\\p{Punct}", "");
        //Stringi space karakterinden kurtaralim
        words = words.replaceAll("\\s", "");
        System.out.println(words);
        //stringi arraya cevirelim
        String words2[] = words.split("");
        System.out.println(Arrays.toString(words2));

        //Arrayi map e atayip foreach ile key value iliskisi kuralim
        // bos bu Hashmap olusturup karakterleri foreach ile ekleyelim map e ekleyelim

        HashMap<String, Integer> ch = new HashMap<>();

        for (String w : words2) {
            Integer numOfOccurance = ch.get(w);
            if (numOfOccurance == null) {
                ch.put(w, 1);
            } else {
                ch.replace(w, numOfOccurance + 1);
            }

        }
        System.out.println(ch); //{r=1, e=2, H=2, y=1, l=2, n=1, o=1}

    }
}
