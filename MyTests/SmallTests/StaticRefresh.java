package SmallTests;

public class StaticRefresh {
    public static void main(String[] args) {
        Cars civic = new Cars(180, "Honda");
        Cars camry = new Cars(240, "Toyota");
        Cars.colorDescription = "Red";
        civic.returnAllData();
        camry.returnAllData();
        Cars.colorDescription = "Green";
        civic.returnAllData();
        camry.returnAllData();
    }
}

class Cars {
    private int horsePower;
    private String brand;
    private static int countCars;
    public static String colorDescription;

    public Cars(int horsePower, String brand) {
        this.horsePower = horsePower;
        this.brand = brand;
        countCars++;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void returnAllData(){
        System.out.println(getBrand()+" "+getHorsePower()+" "+colorDescription);
    }
}

