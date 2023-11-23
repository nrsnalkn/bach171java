package day31mapsexceptions;

public class E03 {
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s,2);
        String t = "Java";
        getCharFromString(t,4);

    }

    //stringlerde var olmayan indexler kullanildiginda java StringIndexOutOfBoundsException atar
    public static void getCharFromString(String s, int index) {
        //ctrl+alt+ T

        try {
            char ch = s.charAt(index);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Olmayan index kullanim hatasi yaptiniz.." + e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace(); // atilan exception loglarini consolde gosterir
            /*
            java.lang.StringIndexOutOfBoundsException: Index 4 out of bounds for length 4
            at java.base/java.lang.String.checkIndex(String.java:4557)
            at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
            at java.base/java.lang.String.charAt(String.java:1515)
            at day31mapsexceptions.E03.getCharFromString(E03.java:17)
            at day31mapsexceptions.E03.main(E03.java:8)

             */

            System.out.println("Kod calismaya devam etti");
        }


    }

}

