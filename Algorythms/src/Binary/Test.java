package Binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        int counter, num, item, first, last, array[] = {1, 2, 35, 4, 5, 88, 700, 55, 66, 6};
        Scanner input = new Scanner(System.in);
        // сортируем массив и выводим
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        System.out.println("Enter number for Binary search: ");
        item = input.nextInt();
        first = 0;
        last = array.length - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);

    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] < item) {
                first = position + 1;
            } else {
                last = position - 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item+ " is " +position+ " element in array.");
            System.out.println("With binary search we made it in " +comparisonCount+ " times.");
        }

    }
}