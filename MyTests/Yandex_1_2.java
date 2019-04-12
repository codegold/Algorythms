package MyTests;

import java.util.Arrays;
import java.util.Scanner;

public class Yandex_1_2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); //
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
//        System.out.print ("Inserted array elements:");
//        for (int i = 0; i < size; i++) {
//            System.out.print (" " + array[i]);
//        }
//        System.out.println();

        //System.out.println(Arrays.toString(array));
        //System.out.println(array);
        array = deleteDuplicate(array);
        //System.out.println(Arrays.toString(array));
        //System.out.println("Count numbers: " + array.length);
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }

    static int[] deleteDuplicate(int[] array) {
        int index = 0;
        while (index < array.length) {
            int count = 0;
            for (int i = index + 1; i < array.length - count; i++) {
                if (array[i] == array[index]) {
                    System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                    count++;
                    i--;
                }
            }
            array = Arrays.copyOf(array, array.length - count);
            index++;
        }
        return array;
    }


}

