package pl.sdacademy.inheritance;


public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car(150, 200,4, 150 );
        System.out.println(car);

        Vehicle bicycle = new Bicycle(15, 45, 2, 7);
        System.out.println(bicycle);
    }
}
