package src.SchildtWork.Inheritance;

public class Bike extends Vehicle{
    private  int maxSpeed;

    public Bike(int passengers, int fuelCap, int mpg, int maxSpeed) {
        super(passengers, fuelCap, mpg);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
