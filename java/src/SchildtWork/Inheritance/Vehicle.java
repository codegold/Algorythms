package src.SchildtWork.Inheritance;

public class Vehicle {
    private int passengers;
    private int fuelCap;
    private int mpg;

    public Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    // Возвратить дальность поездки транспортного средства
    int range() {
        return mpg * fuelCap;
    }

    // Вычислить объем топлива, требующегося
    // для прохождения заданного пути

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
