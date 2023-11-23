package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");

        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

//        s.remove(3);
//        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Niyazi, Bilal, Abdullah, Nuriye]
//        s.remove(); // ilk gordugunu siler
//        System.out.println(s);
//        s.remove("Orhan");
//        System.out.println(s);//[Nuriye, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
//        s.removeFirstOccurrence("Nuriye");//ilk gordugun nuriye yi bul ve sil
//        System.out.println(s);//[Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
//        s.removeLastOccurrence("Nuriye");
//        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */
        String r1 = s.peek();//Nuriye
        System.out.println(r1);
        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /*
        Retrieves and removes the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */
        String r2 = s.poll();//ilk node kesip verir yani yazdirir
        System.out.println(r2);//Nuriye
        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty

        peek() ve element() methodlari ilk elemani dondurur
        peek() methodu list bossa null verir element() methodu list bos ise  NoSuchElementException atar(Throws)
         */
        String r3 = s.element();//list in basini verir
        System.out.println(r3);//Orhan
        System.out.println(s);//[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /*
          pop() ve poll() methodlari ilk elemani siler ve dondurur
          poll() methodu list bossa null verir pop() methodu list bos ise  NoSuchElementException atar(Throws)
         */
        String r4 = s.pop();
        System.out.println(r4);//Orhan
        System.out.println(s);//[Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]


    }
}
