package Lafore;


class ArrayIns {
    private int[] a;
    private int nElems;

//---------------------------------------------------------------------------

    public ArrayIns(int max) {
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
            System.out.println(a[j] + " ");
        System.out.println();
    }

//---------------------------------------------------------------------------

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {          //out - deviding marker
            int temp = a[out];                    //Copy (left)marked element
            in = out;                                  ///Begin move from out
            while (in > 0 && a[in - 1] >= temp) {//While smallest not founded
                a[in] = a[in - 1];                       //Move element right
                --in;                                      //Go one move left
            }
            a[in] = temp;                             //Insert marker element

        }
    }
}
//---------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////

class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayIns arr = new ArrayIns(100);

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
