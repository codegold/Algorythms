package src.AlgorythmsWork.AlgoDraw.RecursionSomeTasks.Merge;

public class MyMerge {
    public static void main(String[] args) {
        int[] arrA = {23, 47, 81, 95};
        int[] arrB = {7, 14, 39, 55, 62, 74};
        int[] arrC = new int[10];
        myMerge(arrA, 4, arrB, 6, arrC);
        myDisplay(arrC, 10);
    }

    private static void myDisplay(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println("");
    }

    // Слияние массивов A и B в массив C
    public static void myMerge(int[] arrA, int sizeA,
                               int[] arrB, int sizeB,
                               int[] arrC) {
        int countA = 0, countB = 0, countC = 0;

        while (countA < sizeA && countB < sizeB)
            if (arrA[countA] < arrB[countB])
                arrC[countC++] = arrA[countA++];
            else
                arrC[countC++] = arrB[countB++];

        while (countA < sizeA)
            arrC[countC++] = arrA[countA++];
        while (countB < sizeB)
            arrC[countC++] = arrB[countB++];


    }
}
