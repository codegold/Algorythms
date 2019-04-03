package Lafore;


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
//---------------------------------------------------------------------------

    public void insertionSortTimVer() {
        int k, i;
        for (i = 1; i < nElems; i++) {
            k = i;                                 //Copy to another position
            while (k > 0 && a[k - 1] > a[k]) {  //Пока не в самом лево, и тот
                int temp = a[k - 1];              //кто слева - выше чем а[к]
                a[k - 1] = a[k];      //поменять местами (через времен перем)
                a[k] = temp;
                k -= 1;                               // человек теперь левее
            }
        }
    }
}
//---------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////

class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        MyArrayIns arr = new MyArrayIns(100);

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

        arr.insertionSortTimVer();
        arr.display();
    }


}
