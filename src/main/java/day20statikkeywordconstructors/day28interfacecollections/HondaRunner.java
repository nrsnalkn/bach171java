package day20statikkeywordconstructors.day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic = new Civic();
        myCivic.cool();//Civic cools perfectly
        myCivic.run();//Accord cools super
        myCivic.eco();//Uses gas less
        Engine.stop();//Stop securely

        Accord myaccord = new Accord();
        myaccord.cool(); //Accord cools super
        myaccord.run();//Engine runs super

        System.out.println("Ac price = "+ Ac.price);//2000
        System.out.println("Engine price = "+ Engine.price);//3000
        System.out.println("Security price = "+ Security.price);//5000
    }
}
