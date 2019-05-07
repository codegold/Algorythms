package MyLamp;

public class Program {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();

        //sw.addElectricityListener(lamp);

        sw.switchOn();

        //lamp.lightOn();
    }
}
