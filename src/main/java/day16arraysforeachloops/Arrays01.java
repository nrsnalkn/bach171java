package day16arraysforeachloops;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;

        //Bu yapinin icinde sadece bir tane data depolanabilir
        //ama biz kod yazarken bir yapinin icine toplu data depolama ihtiyaci hissederiz
        //Bir yapinin icinde coklu data depolayabilmek icin java array yapisini olusturmustur

        //Array nasil olusturulur?

        String stdNames [] = new  String[5] ;
        //Arrylerin console da yazdirilmasi
        //toString() methodu nu kullanmadan sadece aryy ismi ile yazdirisak bize  arrtyin referens numarasini dondorur
        System.out.println(Arrays.toString(stdNames));
        /*
        Arrayler diger collectionlardan cok daha hizlidir (superfast).
        Arrayler diger collectionlardan da az memoryde yer kaplarlar
         */

        //arry e nasil eleman eklenir
        stdNames[2] = "Benna";
        stdNames[3] = "Abdullah";
        stdNames[4] = "Recep";
        stdNames[0] = "Ekim";
        stdNames[1] = "Esat";
        System.out.println(Arrays.toString(stdNames));
        //Arrayden specific bir elemani nasil aliriz
        System.out.println(stdNames[3]); // Abdullah stdNames[3] karsisinda string oldugu icin tostring() methoduna ihtiyac yok
        System.out.println(stdNames[1]); //Esat

        //Ornek 1 :Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdirin
        //Lenght() srtinglerde method () parantezli yazilir arraylerde parantesiz yazilir
        for (int i =0; i<stdNames.length; i++){

            System.out.println(stdNames[i] + " !" );
        }




    }


}
