package SmallTests;

import java.util.Arrays;

public class InsertSort {
    static int[] myArr = {5, 3, 4, 1, 2};

    public static void main(String[] args) {

        //System.out.println(insertionSort(myArr));
        System.out.println(Arrays.toString(myArr));
        insertionSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    static void insertionSort(int[] myArr) {
        for (int i = 1; i < myArr.length; i++) {
            int k = i;
            while (k > 0 && myArr[k - 1] > myArr[k]) {
                //swap(myArr[k-1], myArr[k]);
                int temp = myArr[k - 1];
                myArr[k - 1] = myArr[k];
                myArr[k] = temp;

                k--;
            }
        }
    }


}
