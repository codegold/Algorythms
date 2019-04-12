package MyTests;


class MyArrayIns {
    private int[] a;
    private int nElems;

//---------------------------------------------------------------------------

    public MyArrayIns(int max) {
        a = new int[max];
        nElems = 0;
    }

//---------------------------------------------------------------------------

    public void insert(int value) {
        a[nElems] = value;
        nElems++;
    }

//---------------------------------------------------------------------------

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    //-----------------------------------------------------------------------
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    //-----------------------------------------------------------------------
    public void insertionSort() {
        int k, j;
        for (j = 1; j < nElems; j++) {
            k = j;
            while (k>0 && a[k-1] > a[k]) {
                swap(a[k], a[k-1]);
                k--;
            }

        }

    }
}
//---------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////

class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        MyArrayIns arr = new MyArrayIns(maxSize);

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

        arr.insertionSort();
        arr.display();
    }


}
