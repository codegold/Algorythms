package Lafore;

public class LowArray {
    private long[] a;                // Ссылка на массив a

    public LowArray(int size) {     // Конструктор
        a = new long[size];         // Создание массива
    }

    public void setElem(int index, long value) { // Запись элемента
        a[index] = value;
    }

    public long getElem(int index) {             // Чтение элемента
        return a[index];
    }
}

class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100); // Ссылка и Создание объекта LowArray
        int nElems = 0;                 // Количество элементов в массиве
        int j;                          // Переменная цикла

        arr.setElem(0, 77); // Вставка 10 элементов
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10; // Массив содержит 10 элементов

        for(j=0; j < nElems; j++)
            System.out.print(arr.getElem(j) + " "); // Вывод элементов
        System.out.println();

        int searchKey = 55;                     // Поиск элемента
        for (j=0; j < nElems; j++)              // Для каждого элемента
            if(searchKey == arr.getElem(j))     // Значение найдено?
                break;
        if (j == nElems)                        // Нет
        System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " +searchKey);

        // Удаление элемента с ключом 55

        for (j=0; j<nElems; j++)                // Поиск удаляемого элемента
            if (arr.getElem(j) == 55)
                break;
        for (int k = j; k < nElems; k++)        // Сдвиг последующих элементов
            arr.setElem(k, arr.getElem(k+1));
        nElems--;                               // Уменьшение размера
        for(j=0; j < nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println(" ");


    }

}

