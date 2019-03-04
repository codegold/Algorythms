package Linear;

public class FractionalKnapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4,20);
        final Item item2 = new Item(3,18);
        final Item item3 = new Item(2,14);

        final Item[] items = {item1, item2, item3}; // Our backpack.
    }
}

class Item { // Class will represent item.
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitofWeight() { // Вычисляем ценность на единицу измерения.
        return value / (double) weight; // Чтобы получить число
        // не int - одному из чисел меняем int на double.
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public String toString() {// Переопределим toString чтобы он
        // корректно возвращал представление наших предметов.
        return "{w:" + weight + "v:" + value + "}";
    }
}
