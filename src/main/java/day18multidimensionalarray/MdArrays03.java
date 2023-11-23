package day18multidimensionalarray;

import java.util.Arrays;

public class MdArrays03 {
    public static void main(String[] args) {
        //Example 1: iki boyutlu bir arrayi tek boyutlu array e cevirin
        int numbers [][] = {{5,4},{2,3,2}}; //===> {5,4,3,2}



        //1.step : iki boyutlu arrayde kac tane eleman oldugunu bulan kodu yaziniz
        int toplamelemanSayisi = 0;

        for (int [] w: numbers ) {
            toplamelemanSayisi = toplamelemanSayisi +w.length;

        }
        System.out.println(toplamelemanSayisi);


        //2.step : Tek boyutlu arrayi iki boyutlu arrayin eleman sayisini kullanarak olusturmaliyiz
        int newArr [] = new int[toplamelemanSayisi];


         //3.step : iki boyutlu arraydeki elemanlari tek boyutlu array e transfer etmeliyiz
        int idx=0;

        for(int [] w : numbers){//outer loop ile multidimensional arrayin int array olan elemanlarini tek tek aliriz

            for(int k :w){//inner loop ile w sepetine koymus oldugumuz arrayin elemanlarini tek tek aliriz
                newArr[idx]=k;//yeni olusturmus oldugumuz arraye index kullanarak atama yapiyoruz
                idx++;//bir eleman ekledikten sonra bir yana kaydirma yapiyoruz
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]
    }
}
