package src.SchildtWork.Inheritance;

public class Truck extends Vehicle{
private int cargoCap;

    public Truck(int passengers, int fuelCap, int mpg, int cargoCap) {
        super(passengers, fuelCap, mpg);
        this.cargoCap = cargoCap;
    }

    // Методы доступа к переменной cargocap

    public int getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }
}
