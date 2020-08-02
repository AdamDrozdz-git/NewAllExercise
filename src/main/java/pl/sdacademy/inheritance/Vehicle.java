package pl.sdacademy.inheritance;

public class Vehicle {
    private int speed;
    private int maxSpeed;
    public int wheelCount;

    public Vehicle(int speed, int maxSpeed, int wheelCount) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return " prędkość: " + speed + ", maksymalna prędkośc: " + maxSpeed + ", Liczba kół: " + wheelCount;
    }
}
