package MyLamp;

public class Radio implements ElectricityConsumer {
    public void playsMusic() {
        System.out.println("Radio is on!");
    }

    @Override
    public void electricityIsOn(Object sender) {
        playsMusic();
    }
}