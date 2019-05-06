public class EqualsTest {
    public static void main(String[] args) {
        Car car1 = new Car(1);
        Car car2 = new Car(1);

        System.out.println(car1.equals(car2));
    }
}

class Car {
    private int id;

    public Car(int id) {
        this.id = id;
    }


//    public boolean equals(Object obj) {
//        Car otherCar = (Car) obj;
//        return this.id == otherCar.id;
//    }
}