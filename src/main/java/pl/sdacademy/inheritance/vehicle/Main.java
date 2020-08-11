package pl.sdacademy.inheritance.vehicle;


public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car(55,77,99 );
        System.out.println(car);

        Vehicle bicycle = new Bicycle(15,150,16);
        System.out.println(bicycle);
    }
}
