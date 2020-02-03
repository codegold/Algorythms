package src.Recursion.RecursionSomeTasks.MergeSort;

import static com.sun.deploy.util.ArrayUtil.arrayToString;

public class MergeYou {


    private static void mergeYou(int[] src1, int src1Start, int[] src2, int src2Start,
                                 int[] dest, int destStart, int size) {

        //number of current elem in array
        int index1 = src1Start;
        int index2 = src2Start;

        //find the end of the curr array
        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        //count qauntity of operations, needed to do for all elems
        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    public static int[] mergeSortY(int[] array) {
        int[] tmp;
        int[] currentSrc = array;
        int[] currentDest = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                mergeYou(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

            System.out.println(arrayToString(currentSrc));
        }


    }
}
