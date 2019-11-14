package src.SelectSort;

public class ArraySel {
    private long[] a; // Ссылка на массив a
    private int nElems; // Количество элементов данных

    public ArraySel(int max) {// Конструктор
        a = new long[max];// Создание массива
        nElems = 0; // Пока нет ни одного элемента
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

    public void selectionSort() {
        int in, out, min;
        for (out = 0; out < nElems - 1; out++) {
            min = (int) a[0];
            for (in = 1; in < nElems; in++) {
                if (a[in] < min)
                    a[in] = min;
                int temp = (int) a[in];
                a[in] = min;
                min = temp;

            }
        }
    }

    private void swap(int x, int y) {
        int temp = (int) a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
