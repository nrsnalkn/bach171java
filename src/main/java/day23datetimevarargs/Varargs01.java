package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(toplama(3, 5, 6, 7));

    }

    public static int toplama(int... a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }
    //toplama islemi yapan bir method olusturun
//
//    public  static int toplama(int a , int b){
//     return a+ b;
//    }
//
//    public  static int toplama(int a , int b, int c){
//        return   a+b +c;
//    }
}
