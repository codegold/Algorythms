package Lafore;

import java.util.Arrays;

public class HighArray {
    private int[] a;                              // link on array a
    private int nElems;             // quantity of elements in array

    public HighArray(int max) {                       // constructor
        a = new int[max];                       // creation of array
        nElems = 0;                               // no elements now
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
            for (int k = j; k < nElems; k++)  //  move next elements
                a[k] = a[k + 1];
            nElems--;                         // sizing--
            return true;
        }
    }

    // -------------------------------------------------------------

    public boolean contains(int[] a, int num) {
        for (int i : a) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    // -------------------------------------------------------------

    public void display() {                  //display array content
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    // -------------------------------------------------------------
    public int getMax() {                           //First solution
        int j;
        int max = -1;
        if (nElems == 0) return max;
        for (j = 0; j < nElems; j++)
            if (a[j] > max)
                max = a[j];
        return max;
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
            //if (max != -1)                            //not needed
            delete(max);

            return max;
        }
    }
    // Task 2.3-------------------------------------------------------

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

    // Task 2.6 Get rid of duplicates--------------------------------------

    public void noDups() {
        int i, j;
        for (i = 0; i < nElems; i++) {                 //Taking all array
            j = i + 1;                               //Compare with j var
            while (j < nElems) {                     //To the -2 position
                if (a[i] == a[j]) {                            //Catch ==
                    for (int k = j; k < nElems; k++)
                        //If k == last, Set to zero
                        if (k == a.length - 1) a[k] = 0; //If last same=0
                            // avoids looking for a[k+1] when nElems == a.length
                        else a[k] = a[k + 1];  //Change to next neighbour
                    nElems--;
                } else j++;
            }
        }
    }

    // Task 2.6 second solution. Get rid of duplicates--------------------

    public void noDupsSec() {
        int val;
        for (int i = 0; i < nElems; i++) {
            val = a[i];
            for (int j = i + 1; j < nElems; j++) {
                if (a[j] == val)
                    a[j] = -1;
            }
        }
        delete(-1);
    }
}

// ----------------------------------------------------------------------


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
        arr.insert(17);
        arr.insert(17);
        arr.insert(17);


        arr.display();
        System.out.println();                        // Display elements
        int searchKey = 35;                            // Search element
        if (arr.find(searchKey))
            System.out.println("Task 2.1 Found " + searchKey);
        else
            System.out.println("Task 2.1 Can't find " + searchKey);
        System.out.println();

        arr.display();
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        arr.display();
        System.out.println();

        // 2.2 task-----------------------------------------------------

        System.out.println("Task 2.2 Max is: " + arr.removeMax());
        arr.display();

        // 2.3 task-----------------------------------------------------

        HighArray sortedByKey = new HighArray((maxSize));
        while (arr.getMax() != -1) {
            arr.insert(arr.removeMax());

            sortedByKey.display();
            break;
        }
        // 2.6 task-----------------------------------------------------
        System.out.println("Task 2.3: Kill duplicates.");
        arr.display();
        arr.noDupsSec();
        arr.display();
    }
}


