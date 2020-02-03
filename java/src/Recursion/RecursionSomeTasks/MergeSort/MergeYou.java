package src.Recursion.RecursionSomeTasks.MergeSort;

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


}
