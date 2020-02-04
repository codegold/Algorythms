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

        Arrays.sort(items, Comparator.comparingDouble
                (Item::valuePerUnitOfWeight).reversed());

        System.out.println(Arrays.toString(items));

        final int Сapacity = 7; //Сapacity of our backpack

        int currWeight = 0; //current total weight
        double currValue = 0; //current total value
        int currentItemIndex = 0;

        while (currentItemIndex < items.length && currWeight != Сapacity) {
            //берем обьект целиком
            if (currWeight + items[currentItemIndex].getWeight() < Сapacity) {
                currValue += items[currentItemIndex].getValue();
                currWeight += items[currentItemIndex].getWeight();
            } else
            //берем часть
            {
                currValue += ((Сapacity - currWeight) /
                        (double) items[currentItemIndex].getWeight())
                        * items[currentItemIndex].getValue();

                currWeight = Сapacity; //backpack is full
            }
            currentItemIndex++;
        }
        System.out.println("Ценность наивысшего набора: " + currValue);
    }
}
