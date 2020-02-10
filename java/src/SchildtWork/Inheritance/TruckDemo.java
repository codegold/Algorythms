package src.SchildtWork.Inheritance;

public class TruckDemo {
    public static void main(String[] args) {
        // Создать ряд новых объектов типа Truck
        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);
        double gallons;
        int dist = 100;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi truck can trans: "+semi.getCargoCap() +" funts");
        System.out.println("For "+dist+ " miles, truck will need: "+gallons+ " of fuel. \n");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup can trans: "+pickup.getCargoCap() +" funts");
        System.out.println("For "+dist+ " miles, pickup will need: "+gallons+ " of fuel. \n");

        Bike suzuki = new Bike(2,7,65, 333);
        gallons = suzuki.fuelNeeded(dist);
        System.out.println("Bike can drive: "+suzuki.getMaxSpeed() +" km/h");
        System.out.println("For "+dist+ " miles, bike will need: "+gallons+ " of fuel. \n");


    }
}
