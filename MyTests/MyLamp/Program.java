package MyLamp;

import static java.lang.System.clearProperty;
import static java.lang.System.out;

public class Program {

    public static void fire (Object sender) {
        out.println("Message");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //Event subscribe
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        sw.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityIsOn(Object sender) {
                out.print("Pozhar!!!");
            }
        });

        // sw.addElectricityListener(sender -> out.print("Fireeee!!!"));
        sw.addElectricityListener(Program::fire );

        sw.switchOn();
    }
}