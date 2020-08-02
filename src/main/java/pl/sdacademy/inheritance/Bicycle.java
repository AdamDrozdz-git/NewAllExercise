package pl.sdacademy.inheritance;

public class Bicycle extends Vehicle {
    private int numberOfDerailleur;

    public Bicycle(int speed, int maxSpeed, int wheelCount, int numberOfDerailleur) {
        super(speed, maxSpeed, 2);
        this.numberOfDerailleur = numberOfDerailleur;
    }

    public int getNumberOfDerailleur() {
        return numberOfDerailleur;
    }
    @Override
    public String toString(){
        return "Rower "  + "\n ilość przerzutek: " + numberOfDerailleur + super.toString();
    }
}
