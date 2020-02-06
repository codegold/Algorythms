package src.AlgorythmsWork.AlgoDraw.SelectSort;

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
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (a[in] < a[min]) {
                    min = in;
                    //swap(out, min);
                    int temp = (int) a[out];
                    a[out] = a[min];
                    a[min] = temp;
                }
            }
        }
    }

    private void swap(int x, int y) {
        int temp = (int) a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public void selectionSortMy() {
        int in, out, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++)
                if (a[in] < a[min])
                    min = in;
            swap(min, out);

        }
    }

    public void insertSortTF() {
        for (int i = 1; i < a.length - 1; i++) {
            int k = i;
            while (k > 0 && a[k] > a[k - 1]) {
                swap(k, k - 1);
                k--;
            }
        }
    }

    public void insertSortLafore() {
        int in, out;
        for (out = 1; out < nElems; out++) {// out - разделительный маркер
            long temp = a[out];//Copy marked element
            in = out;//Start from out
            while (in > 0 && a[in - 1] >= temp) {//while not found smallest
                a[in] = a[in - 1]; //move element to left
                --in;
            }
            a[in] = temp;//paste marked element
        }
    }

    public void insertSortMy() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            int temp = out;
            while (temp > 0 && a[temp] > a[temp - 1]) {
                swap(temp, temp - 1);
                temp--;
            }

        }

    }
}
