package day20statikkeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {

        //stdName  static oldugu icin obje olusturmadik
        //sadece class ismi kullanilabilir
        System.out.println(Student.stdName);


        //age non-static oldugu icin ulasmak icin obje olusturmamiz gerekiyor
        Student obje = new Student();

        System.out.println(obje.age);

        Student.staticMethod(); //Ben static methodum

        obje.nonStaticMethod();//Ben static olmayan methodum
        //opbject uzerinden de static class memberlara ulasabiliriz tipki gokteki ay gibi
        //object uzerinden static class memberlara ulasilmazi tavsiye edilmez
        System.out.println(obje.stdName); //Tom Hanks

    }
}
