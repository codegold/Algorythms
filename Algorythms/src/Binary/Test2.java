package Binary;


import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int start, stop, item, array[] = {1, 2, 35, 4, 5, 88, 700, 55, 66, 6};
        Arrays.sort(array);
        Scanner sc = new Scanner(System.in);
        start = 0;
        stop = array.length - 1;
        System.out.println("Enter number:");
        item = sc.nextInt();
        binarySearch(start,stop,item, array);

    }

    public static void binarySearch(int start, int stop, int item, int[] array) {
        int count = 1;
        int mid = (start + stop) / 2;

        while ((start <= stop) && (array[mid] != item)) {
            count++;
            if (array[mid] < item) {
                start = mid + 1;
            } else {
                stop = mid - 1;
            }
            mid = (start + stop) / 2;
        }
        if (start <= stop) {
            System.out.println("Item was on "+mid+ " position.");
            System.out.println("Binaray made it for " +count+ " times.");
        }

    }
}

