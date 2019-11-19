package src.InsertSort;

import java.sql.Time;

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        int maxSize2 = 100000;
        ArrayIns arr = new ArrayIns(maxSize);
        ArrayIns arr2 = new ArrayIns(maxSize2);

      //  arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(55);
        arr.insert(55);
        arr.insert(11);
        arr.insert(11);
//        arr.insert(66);
//        arr.insert(33);
//        arr.insert(77);

        arr.display();
        arr.insertionSortNoDups();
//        System.out.println("Sorting.");
//        arr.insertionSort();
//        arr.display();
//        System.out.println();
//        System.out.println("Test noDups.");
//        arr.noDups();
//        arr.display();
//
//        System.out.println("Task from book.");
//        for (int i = 0; i < maxSize2 ; i++) {
//            long n = (long) (java.lang.Math.random()*(maxSize2-1));
//            arr2.insert(n);
//        }
//        long startTime = System.currentTimeMillis();
//        arr2.insertionSort();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time: "+(endTime-startTime));

    }
}
