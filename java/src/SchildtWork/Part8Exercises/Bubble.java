package src.SchildtWork.Part8Exercises;

public class Bubble {
    static int[] arr = {3, 2, 11, 333, 4, 555};
    static int size = arr.length;

    static int[] bubbleSort(int[] a) {
        int tmp, out, in;
        for (out = arr.length - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    tmp = a[in + 1];
                    a[in + 1] = a[in];
                    a[in] = tmp;
                }
            }
        }
        return a;
    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


    public static void main(String[] args) {
        bubbleSort(arr);
        display(arr);
    }
}
