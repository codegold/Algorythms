package MyTests;

public class MyBubbleSort {
    public int[] a;
    public int nElems;

    public MyBubbleSort(int max) {
        a = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
    }

    public void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void bubbleSort() {
        int i, j;
        for (j = nElems - 1; j > 0; j--)
            for (i = 0; i < j; i++) {
                if (a[i] > a[j])
                    swap(i, j);
            }

    }
}

class App {
    public static void main(String[] args) {
        MyBubbleSort arr = new MyBubbleSort(5);
        arr.insert(77);
        arr.insert(90);
        arr.insert(33);
        arr.insert(44);
        arr.insert(10);
        System.out.println();
        arr.display();
        arr.bubbleSort();
        System.out.println();
        arr.display();

    }
}
