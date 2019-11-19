package src.BubbleSort;

public class BubbleSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        int maxSize2 = 100000;
        ArrayBub arr = new ArrayBub(maxSize);
        ArrayBub arr3 = new ArrayBub(maxSize2);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();

        arr.doubleDirBubbleSort();
        arr.display();

        System.out.println("Create arr2");
        ArrayBub arr2 = new ArrayBub(maxSize);
        arr2.fulfillArray();

        arr2.display();
        System.out.println("arr2 After fullfill.");
        System.out.println("after display");
        arr2.bubbleSortThree();
        arr2.display();
        System.out.println("bubbleSortThree");
        arr2.bubbleSortReverse();
        arr2.display();

        System.out.println("Benchmark.");//BubbleSort 18123
        //DoubleDirSort 12412

        for (int i = 0; i < maxSize2; i++) {
            long n = (long) (java.lang.Math.random() * (maxSize2 - 1));
            arr3.insert(n);
        }
        long startTime = System.currentTimeMillis();
        arr3.oddEvenSortMyThree();
        long stopTime = System.currentTimeMillis();

        System.out.println("Time = " + (stopTime - startTime));
        arr3.display();

    }
}
