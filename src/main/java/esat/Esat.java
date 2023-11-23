package esat;

public class Esat {
    public static void main(String[] args) {

            // Verilen bir string i ters ceviren kodu yaziniz
            //"Java" ==> "avaJ//6 op;'/k'/o/p'[uj8hjoifdfthjh;ydswrikyuhhyfygtrwedwtgvh    4yu66t7y56utiritiit ters = ters + str.charAt(i);


        String str2 = "ali";
        String t2 = "";
        for (int i = str2.length()-1 ; i>=0;i--){
            t2 = t2 + str2.charAt(i);
        }
        System.out.println(t2);
        if (str2.equalsIgnoreCase(t2)) {
            System.out.println("Palindrome dur");
        } else {
            System.out.println("Palindrome degildir");
        }
    }
        }


