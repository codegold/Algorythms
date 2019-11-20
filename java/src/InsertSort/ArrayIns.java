package src.InsertSort;

import static src.BubbleSort.MyBubbleSort.swap;

public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int maxSize) {
        a = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    public void insertionSort() {
        for (int i = 1; i < nElems; i++) {
            int m = i;
            while (m > 0 && a[m] > a[m - 1]) {
                int temp = (int) a[m];
                a[m] = a[m - 1];
                a[m - 1] = temp;
                m--;
            }
        }
    }

    public void insertionSortCountCopiesAndComp() {
        int in, out;
        int copies = 0, comparisons = 0;
        for (out = 1; out < nElems; out++) {
            long temp = a[out]; // Скопировать помеченный элемент
            copies++;
            in = out;  // Начать перемещения с out
            while (in > 0 && a[in - 1] >= temp) { // Пока не найден меньший элемент
                a[in] = a[in - 1];// Сдвинуть элемент вправо
                copies++;
                if (in == 1) comparisons++;
                comparisons++;
                in--; // Перейти на одну позицию влево
            }
            a[in] = temp; // Вставить помеченный элемент
            copies++;
        }
        System.out.println();
        System.out.println("This is insertionSortCountMovesAndCopys()");
        System.out.println(copies + " moves made.");
        System.out.println(comparisons + " comparisons made.");
        display();
    }

    public void insertionSortNoDups() {
        insertionSort();
        display();
        int shiftCount = 0;
        int curr = 0;
        int total = nElems;

        for (int i = 0; i < total; i++) {
            if (a[i] == a[i + 1]) {
                shiftCount++;
                nElems--;
            } else {
                curr = (int) a[i];
                a[i - shiftCount] = a[i];
            }
        }
        display();
    }

    public void noDups() {
        insertionSort();
        for (int i = 0; i < nElems; i++)
            while (a[i] == a[i + 1]) {
                for (int j = i + 1; j < nElems; j++)
                    a[j] = a[j + 1];
                nElems--;
            }
    }
}
