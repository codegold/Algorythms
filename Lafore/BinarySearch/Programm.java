package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Programm {

    public static void binarySearch(int[] myArr, int item) {
        int count = 1, start = 0, stop = myArr.length - 1;
        int mid = (start + stop) / 2;

        while ((start <= stop) && (myArr[mid] != item)) {
            count++;
            if (mid < item) {
                start = mid + 1;
            } else if (mid > item) {
                stop = mid - 1;
            }
            mid = (start + stop) / 2;
        }
        if (start <= stop) {
            System.out.println("Item was on " + mid + " position.");
            System.out.println("Binary count " + count + " times.");
        } else {
            System.out.println("No such number.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArr = {1,2,3,4,5,6,7,8};
//        int[] myArr = new int[15];
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] = ((int) (Math.random() * 20));
//            //myArr[i] = random.nextInt(99) - 15;
//
//            System.out.print(myArr[i] + " ");
//        }

        Arrays.sort(myArr);
        System.out.println(myArr.toString());
        System.out.println("Enter: ");
        int item = sc.nextInt();
        binarySearch(myArr, item);

    }

}
