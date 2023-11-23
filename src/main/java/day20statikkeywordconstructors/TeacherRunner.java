package day20statikkeywordconstructors;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher t1 =new Teacher("Esat", 45,"Ankara");
        System.out.println(t1);
        Teacher t2 = new Teacher("Ali",45);
        System.out.println(t2);
    }
}
