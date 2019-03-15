package Lafore;

import java.util.Arrays;

public class HighArray {
    private int[] a;               // link on array a
    private int nElems;            // quantity of elements in array

    public HighArray(int max) {     // constructor
        a = new int[max];           // creation of array
        nElems = 0;                 // no elements now
    }
    // -------------------------------------------------------------

    public boolean find(int searchKey) {
        int j;
        for (j = 0; j < nElems; j++)            // for each element
            if (searchKey == a[j])              // founded?
                break;                          // yes? exit
        if (j == nElems)
            return false;                       // yes
        else
            return true;                        // no
    }
    // -------------------------------------------------------------

    public void insert(int value) {        //insert element in array
        a[nElems] = value;                 //inserting
        nElems++;                          //sizing++
    }

    public boolean delete(int value) {
        int j;
        for (j = 0; j < nElems; j++)            //searching value
            if (value == a[j])
                break;
        if (value == nElems)
            return false;                     // unsuccessful search
        else {                                // founded
            for (int k = j; k < nElems; k++)  //move next elements
                a[k] = a[k + 1];
            nElems--;                         // sizing--
            return true;
        }
    }
    // -------------------------------------------------------------

    public void display() {                  //display array content
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    // -------------------------------------------------------------

    public int removeMax() {          //Show highest and delete then
        int max = 0;

        if (a.length == 0) {
            return -1;
        } else {
            for (int j = 0; j < a.length; j++)
                if (a[j] > max)
                    max = a[j];
            //if (max != -1)          //not needed.
                delete(max);

            return max;
        }
    }
    // -------------------------------------------------------------

    public int removeMaxTwo() {  // Empty Array here. Check whats up
        //int i =0;
        if (a.length == 0) {
            return -1;
        } else {
            Arrays.sort(a);
            //int max = a[a.length - 1];

//            for (int i = 0; i < a.length - 2; i++) {
//                a[i] = a[i + 1];
//            }
            return -2;
        }
    }
}
    // -------------------------------------------------------------


class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; //Array size
        HighArray arr = new HighArray(maxSize);
        // Creation and link on array

        arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                        // Display elements
        int searchKey = 35;                   // Search element
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();

        System.out.println();
        System.out.println("Max is: " + arr.removeMax());

        arr.display();

//        System.out.println();
//        System.out.println("Max is: " + arr.removeMaxTwo());
//
//        arr.display();
    }
}
