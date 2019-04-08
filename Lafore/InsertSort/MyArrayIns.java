package Lafore.InsertSort;


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

//---------------------------------------------------------------1------------

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

//---------------------------------------------------------------------------

    public int median() {

        MyArrayIns arr = new MyArrayIns(nElems);
        for (int i = 0; i < nElems; i++) {
            arr.insert(a[i]);
        }
        arr.insertionSort();
        if (arr.nElems % 2 == 0) {
            return (arr.a[(nElems / 2) + 1] / 2);
        } else {
            return arr.a[nElems / 2];
        }
    }

//---------------------------------------------------------------------------

    public void noDups() {
        MyArrayIns arr = new MyArrayIns(nElems);
        for (int i = 0; i < nElems; i++) {
            arr.insert(a[i]);
        }
        arr.insertionSort();
        int k, j;
        for (k = 0; k < nElems; k++) {
            j = k + 1;
            while (j < nElems) {
                if (a[k] == a[j]) {
                    for (int m = j; m < nElems; m++)
                        if (m == a.length - 1) a[m] = 0;
                        else a[m] = a[m + 1];
                    nElems--;
                }else j++;
            }
        }
    }
}
/////////////////////////////////////////////////////////////////////////////
