package Lafore;


class ArraySel {
    private int[] a;
    private int nElems;

    //---------------------------------------------------------

    public ArraySel(int max) {                   //Constructor
        a = new int[max];
        nElems = 0;
    }
    //---------------------------------------------------------

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    //---------------------------------------------------------

    public void insert(int value) {
        a[nElems] = value;                          //Inserting
        nElems++;                               //Array size ++
    }

    //---------------------------------------------------------

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) {        //Outer
            min = out;                                //Minimum
            for (in = out + 1; in < nElems; in++)       //Inner
                if (a[in] < a[min])
                    min = in;
            swap(out, min);
        }
    }
    //---------------------------------------------------------

    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    //---------------------------------------------------------
}

///////////////////////////////////////////////////////////////////

class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySel arr = new ArraySel(maxSize);
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
        arr.selectionSort();
        arr.display();
    }
}

