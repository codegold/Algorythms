package Lafore;

public class OrderedArray {
    class OrdArray {
        private long[] a;   // Ссылка на массив a
        private int nElems;// Количество элементов данных

        public OrdArray(int max) {  // Конструктор
            a = new long[max];       // Создание массива
            nElems = 0;
        }

        public int size() {
            return nElems;
        }

        public int find(long searchKey) {
            int lowerBound = 0;
            int upperBound = nElems - 1;
            int curIn;

            while (true) {
                curIn = (lowerBound + upperBound) / 2;
                if (a[curIn] == searchKey)                  // Элемент найден
                    return curIn;
                else if (lowerBound > upperBound)
                    return nElems;                         // Элемент не найден
                else {
                    if (a[curIn] < searchKey)
                        lowerBound = curIn + 1;            // В верхней половине
                    else
                        upperBound = curIn - 1;             // В нижней половине

                }
            }
        }

        public void insert(long value) {                // Вставка элемента в массив
            int j;
            for (j = 0; j < nElems; j++)                // Определение позиции вставки
                if (a[j] > value)                       // (линейный поиск)
                    break;
            for (int k = nElems; k > j; k--)            // (линейный поиск)
                a[k] = a[k - 1];
            a[j] = value;                               // Вставка
            nElems++;                                   // Увеличение размера
        }

    }
}
