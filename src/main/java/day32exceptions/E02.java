package day32exceptions;

public class E02 {
    public static void main(String[] args) {
        //Birbirine donusturulemeyecek data type larini donusturmekte israr ederseniz java ClassCastException atar.
        Object obj = 70;
        try {
            String str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {

            System.err.println("Her data type i her data type ceviremezsin");

        }
    }
}
