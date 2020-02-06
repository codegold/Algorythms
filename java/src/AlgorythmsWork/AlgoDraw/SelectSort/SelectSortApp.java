package src.AlgorythmsWork.AlgoDraw.SelectSort;

public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        int maxSize2 = 100000;
        ArraySel arr = new ArraySel(maxSize);
        ArraySel arr2 = new ArraySel(maxSize2);
        arr.insert(77); // Вставка 10 элементов
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
        //arr.selectionSortMy();
        arr.insertSortMy();
        arr.display();

        System.out.println("Task from book.");

        arr2.display();
        for (int i = 0; i < maxSize2; i++) {
            long n = (long) (java.lang.Math.random() * (maxSize2 - 1));
            arr2.insert(n);
        }
        long startTime = System.currentTimeMillis();
        arr2.selectionSort();
        long stopTime = System.currentTimeMillis();

        System.out.println("Time = " + (stopTime - startTime));
        arr2.display();
    }
}
