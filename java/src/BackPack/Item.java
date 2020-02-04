package src.BackPack;

public class Item {
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    @Override
    public String toString() {
        return "Item{" + "weight=" + weight + ", value=" + value + '}';
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}
