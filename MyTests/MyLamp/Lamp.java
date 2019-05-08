package MyLamp;

public class Lamp implements ElectricityConsumer{
    public void lightOn() {
        System.out.println("Lamp is on!");
    }

    @Override
    public void electricityIsOn(Object sender) {
        lightOn();
    }

}