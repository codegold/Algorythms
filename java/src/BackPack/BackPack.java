package src.BackPack;

import java.util.Arrays;
import java.util.Comparator;

//Алгоритмы и Структуры Данных. Урок 9: Жадные алгоритмы.
// Задача о рюкзаке (Реализация)

public class BackPack {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3};

        System.out.println(Arrays.toString(items));

        Arrays.sort(items, Comparator.comparingDouble(
                Item::valuePerUnitOfWeight).reversed());

        System.out.println(Arrays.toString(items));

        final int Capacity = 7;

        int currWeight = 0;
        double currValue = 0;
        int currItemIndex = 0;

        while (currItemIndex < items.length && currWeight < Capacity) {
            if (currWeight + items[currItemIndex].getWeight() < Capacity){
                currWeight += items[currItemIndex].getWeight();
                currValue += items[currItemIndex].getValue();
            }
            else {
                currValue += ((Capacity - currWeight) / (double)items[currItemIndex].getWeight())
                        * items[currItemIndex].getValue();

                currWeight = Capacity;
            }

            currItemIndex++;
        }

        System.out.println("Max value in backpack is: " + currValue);
    }
}
