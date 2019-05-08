package MyLamp;

@FunctionalInterface
public interface ElectricityConsumer {
    void electricityIsOn(Object sender);
}