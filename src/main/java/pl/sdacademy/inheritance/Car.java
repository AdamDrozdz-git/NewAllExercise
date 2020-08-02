package pl.sdacademy.inheritance;

public class Car extends Vehicle {
    private int horsePower;

    public Car(int speed, int maxSpeed, int wheelCount, int horsePower) {
        super(speed, maxSpeed, 4);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Samochód "  + "\n moc: " + horsePower + super.toString();
    }
}

