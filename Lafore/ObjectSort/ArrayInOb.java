package Lafore.ObjectSort;

class ArrayInOb {

    private Person[] a;
    private int nElems;

    //---------------------------------------------------------------------------

    public ArrayInOb(int max) {                                     //Constructor
        a = new Person[max];
        nElems = 0;
    }
//-------------------------------------------------------------------------------

    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }
//-------------------------------------------------------------------------------

    public void display() {
        for (int i = 0; i < nElems; i++) {
            a[i].displayPerson();   //попробовать sout a[i] =  " "
        }
    }
//-------------------------------------------------------------------------------

    public void insertSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            in = out;
            Person temp = a[out];
            while (in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}

