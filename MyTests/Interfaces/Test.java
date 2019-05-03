package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");

        outputinfo(info1);
        outputinfo(info2);

        Animal animal3 = new Animal(3);

        outputinfo(animal3);

        List cars = new ArrayList();



    }

    public static void outputinfo(Info info) {
        info.showInfo();
    }
}
