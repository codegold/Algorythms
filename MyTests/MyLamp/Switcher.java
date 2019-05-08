package MyLamp;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Tumbler is on!");
        for (ElectricityConsumer ec : listeners)
            ec.electricityIsOn(this);
    }

}
 