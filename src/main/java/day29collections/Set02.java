package day29collections;

import java.util.HashSet;
import java.util.TreeSet;


public class Set02 {
    public static void main(String[] args) {
        //ornek 3 : ogrenci email adreslerini natural orderr da siralanmis olarak depolayin

        long t1 = System.nanoTime();

        //1.yol
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("f@gmail.com");
        emails.add("c@gmail.com");
        emails.add("n@gmail.com");
        emails.add("m@gmail.com");
        emails.add("z@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, f@gmail.com, m@gmail.com, n@gmail.com, z@gmail.com]
        System.out.println(t1);

        long t2 = System.nanoTime();
        //2.yol
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("a@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("f@gmail.com");
        emailsHs.add("c@gmail.com");
        emailsHs.add("n@gmail.com");
        emailsHs.add("m@gmail.com");
        emailsHs.add("z@gmail.com");
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);//[a@gmail.com, b@gmail.com, c@gmail.com, f@gmail.com, m@gmail.com, n@gmail.com, z@gmail.com]

        long t3 = System.nanoTime();

        System.out.println("treeset " + (t2-t1) );
        System.out.println("hashset " + (t3-t2) );

    }
}
