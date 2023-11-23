package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you, like like!";
        s = s.replaceAll("\\p{Punct}", ""); // String deki noktalama isaretlerinden kurtulduk

        System.out.println(s); //I like you like like

        // kelimelerin gorunum sayisini bulacagimiz icin String i kelimelere bolduk
        String words [] =  s.split(" ");
        System.out.println(Arrays.toString(words)); // Array yapisina cevirdik [I, like, you, like, like]

        //words arrayindeki kelimeler birer birer map de var mi diye kontrol edecegiz
        // words arrayindeki kelimeler map te yoksa e value su 1 olarak yerlestirilecek
        // words arrayindeki kelimeler map te varsa map e varolan value yu 1 artirarak yerlestirecek
        HashMap<String,Integer> occ = new HashMap<>();

        for (String w:words ) {
          Integer numOfOccurance =  occ.get(w);
          if (numOfOccurance==null){
              occ.put(w,1);
          } else {
              occ.replace(w,numOfOccurance+1);
          }

        }
        System.out.println(occ); //{like=3, I=1, you=1}
        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

    }
}
