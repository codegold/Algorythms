package src.ListInsertionSort;

public class ListInsertSortApp {
    public static void main(String[] args) {
        int size = 10;
        Link[] linkArray = new Link[size];

        for (int i = 0; i < size; i++) {
            int n = (int) (java.lang.Math.random() * 99);
            Link newLink = new Link(n);
            linkArray[i] = newLink;
        }
        System.out.print("Unsorted array: ");
        for (int i = 0; i < size; i++)
            System.out.print(linkArray[i].dData + " ");

        System.out.println("");
        // Создание нового списка
        // инициализированного содержимым массива
        SortedList theSortedList = new SortedList(linkArray);

        for (int j = 0; j < size; j++)  // links from list to array
            linkArray[j] = theSortedList.remove();

        System.out.print("Sorted Array: ");
        for (int k = 0; k < size; k++)
            System.out.print(linkArray[k].dData + " ");
        System.out.println();


    }
}
