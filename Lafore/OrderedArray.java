package Lafore;

import java.util.Arrays;

class OrdArray {
    private long[] a;                       // Ссылка на массив a
    private int nElems;            // Количество элементов данных

    public OrdArray(int max) {                     // Конструктор
        a = new long[max];                    // Создание массива
        nElems = 0;
    }

    //-----------------------------------------------------------
    public int size() {
        return nElems;
    }

    //-----------------------------------------------------------
    public int find(long searchKey) {             //Binary search
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)          // Элемент найден
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;               // Элемент не найден
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1;  // В нижней половине
            }
        }
    }

    //-----------------------------------------------------------
    public void insert(long value) { // Вставка элемента в массив
        int j;

        for (j = 0; j < nElems; j++)//Определение позиции вставки
            if (a[j] > value)                 // (линейный поиск)
                break;
        for (int k = nElems; k > j; k--) //Перемещ след элементов
            a[k] = a[k - 1];
        a[j] = value;                                  // Вставка
        nElems++;                           // Увеличение размера
    }

    //-----------------------------------------------------------
    public void insertBinary(int value) {//Insert w binary search
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        int j = nElems;

        curIn = (lowerBound + upperBound) / 2;
        while ((a[curIn] != value) && (lowerBound <= upperBound)) {
            if (a[curIn] < value) {
                lowerBound = curIn + 1;
            } else {
                upperBound = curIn - 1;      // В нижней половине
            }
            curIn = (lowerBound + upperBound) / 2;
        }
        for (int k = nElems; k < j; k--)   // move bigger ones up
            a[k] = a[k - 1];
        a[j] = value;                                // insert it
        nElems++;                               // increment size
    }

    //-----------------------------------------------------------
    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems)                    //Search unsuccessful
            return false;
        else {
            for (int k = j; k < nElems; k++)      //Move elements
                a[k] = a[k + 1];
            nElems--;
            return true;                        //Decreasing size
        }
    }

    //-----------------------------------------------------------
    public void deleteBinary(int value) {    //Delete with binary
        int f = find(value);
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        curIn = (lowerBound + upperBound) / 2;
        while ((a[curIn] != value) && (lowerBound <= upperBound)) {
            if (a[curIn] < value + 1) {
                lowerBound = curIn + 1;
            } else {
                upperBound = curIn - 1;
            }
            curIn = (lowerBound + upperBound) / 2;
        }

        for (int k = f; k < nElems; k++)          //Move elements
            a[k] = a[k + 1];
        nElems--;
    }
    //-----------------------------------------------------------

    public void display() {                       //Display array
        for (int j = 0; j < nElems; j++)           //All elements
            System.out.print(a[j] + " ");       //Display current
        System.out.println(" ");
    }
    //-----------------------------------------------------------

    public OrdArray merge(OrdArray other) {
        int maxSize = nElems;
        if (other != null)
            maxSize += other.nElems;

        OrdArray result = new OrdArray(maxSize);
        if (other == null) {                    // If other empty
            for (int i = 0; i < nElems; i++)  // For all elements
                result.insert(a[i]);           //Insert in result
        } else {
            int i = 0, j = 0;
            while (true) {
                if (i < nElems && j < other.nElems) {
                    if (a[i] < other.a[j]) {
                        result.insert(a[i]);
                        i++;
                    } else if (a[i] == other.a[j]) {
                        result.insert(a[i]);
                        i++;
                        //j++;            //If without duplicates
                    } else {
                        result.insert(other.a[j]);
                        j++;
                    }
                } else {
                    while (i < nElems) {
                        result.insert(a[i]);
                        i++;
                    }
                    while (j < other.nElems) {
                        result.insert(other.a[j]);
                        j++;
                    }
                    break;
                }
            }
        }
        return result;
    }
}

/////////////////////////////////////////////////////////////////

class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;                           //Array size
        OrdArray arr = new OrdArray(maxSize);//Link to and create
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

        int searchKey = 55;
        if (arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        arr.display();

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
        System.out.println();

        System.out.println("Adding 222.");
        arr.insertBinary(222);
        arr.display();
        System.out.println("Adding 45.");
        arr.insertBinary(45);
        arr.display();
        System.out.println();
        arr.deleteBinary(33);
        System.out.println();
        System.out.println("Deleted with deleteBinary 33 ");
        arr.display();
        arr.deleteBinary(44);
        System.out.println("Deleted with deleteBinary 44 ");
        arr.display();
        System.out.println();
        System.out.println();

        OrdArray arr1 = new OrdArray(6);
        arr1.insert(110);
        arr1.insert(120);
        arr1.insert(130);
        arr1.insert(140);
        arr1.insert(150);
        arr1.insert(160);

        OrdArray arr2 = new OrdArray(3);
        arr2.insert(111);
        arr2.insert(121);
        arr2.insert(131);

        OrdArray arr3 = arr1.merge(arr2);
        System.out.println();

        arr1.display();
        arr2.display();
        System.out.print("Merged array:");
        arr3.display();

    }
}
/////////////////////////////////////////////////////////////////

