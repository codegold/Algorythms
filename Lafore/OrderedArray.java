package Lafore;

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
        int j=nElems;

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
    public void deleteBinary(int value) {         //Binary search
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
    }
}
/////////////////////////////////////////////////////////////////

