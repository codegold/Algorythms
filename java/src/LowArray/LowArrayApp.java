package src.LowArray;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(11);
        int nElems;
        int j;
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;
        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();
        int searchKey = 66;
        System.out.println("Search for: " + searchKey);
        for (j = 0; j < nElems; j++)
            if (arr.getElem(j) == searchKey)
                break;
        if (j == nElems) System.out.println("no such");
        else System.out.println("Gotcha! " + searchKey + " founded at " + j);
        System.out.println("Testing printArr.");
        arr.printArr();

        System.out.println();
        searchKey = 55;
        // Удаление элемента с ключом 55
        System.out.println("Searching for " + searchKey);
        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();
        for (j = 0; j < nElems; j++) {
            if (arr.getElem(j) == searchKey) {
                break;
            }
        }
        for (int k = j; k < nElems; k++) {
            arr.setElem(k, arr.getElem(k + 1));
        }
        nElems--;
        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }

        System.out.println();
        arr.printArr();
    }
}



