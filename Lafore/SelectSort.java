package Lafore;

public class SelectSort {
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
                System.out.println(a[i] + " ");
            System.out.println();
        }
        //---------------------------------------------------------

        public void selectionSort() {
            int out, in, min;
            for (out = 0; out < nElems - 1; out++) {        //Outer
                min = out;                                //Minimum
                for (in = out + 1; in < nElems; in++)       //Inner
                    if (a[in] > a[in + 1])
                        min = in;
                swap(out, in);
            }
        }
        //---------------------------------------------------------

        private void swap(int one, int two) {
            int temp = a[one];
            a[one] = a[two];
            a[two] = temp;
        }
        //---------------------------------------------------------

        ///////////////////////////////////////////////////////////
    }
}
