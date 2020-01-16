package src.Recursion.RecursionSomeTasks.MergeSort;

public class DArray {
    private long[] theArray;          // Ссылка на массив theArray
    private int nElems;               // Количество элементов данных

    public DArray(int max) {
        theArray = new long[max]; // Создание массива
        nElems = 0;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(theArray[j] + " ");
            System.out.println("");
        }
    }

    public void mergeSort() {
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems - 1);
    }

    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound)
            return;
        else {
            int mid = (lowerBound + upperBound) / 2; //search for middle

            recMergeSort(workSpace, lowerBound, mid); //sort of bottom half
            recMergeSort(workSpace, mid + 1, upperBound); //sort of upper

            merge(workSpace, lowerBound, mid + 1, upperBound);//merge
        }
    }

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;                         //index in working area
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1; //quantity of elements

        while (lowPtr <= mid && highPtr <= upperBound)
            if (theArray[lowPtr] < theArray[highPtr])
                workSpace[j++] = theArray[lowPtr++];
            else
                workSpace[j++] = theArray[lowPtr++];

            while (lowPtr <= mid)
                workSpace[j++] = theArray[lowPtr++];

            while (highPtr <= upperBound)
                workSpace[j++] = theArray[highPtr++];

        for (j = 0; j < n; j++) {
            theArray[lowerBound+j] = workSpace[j];
        }

    }


    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }
}
