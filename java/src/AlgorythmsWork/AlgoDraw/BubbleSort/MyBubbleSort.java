package src.AlgorythmsWork.AlgoDraw.BubbleSort;

public class MyBubbleSort {
    static int[] array = new int[10];

    public static void bubbleSortMy(int[] array) {
        int finish = array.length - 1;
        for (int i = finish; i > 0; i--)
            if (array[i] > array[i - 1]) {
                swap(array[i], array[i - 1]);
                finish--;
            }
    }


    public static void swap(int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    public static void main(String[] args) {
        int min = 0;
        int max = 99;
        for (int i = 0; i < array.length; i++) {
            int random = (int) (min + (Math.random() * max));
            array[i] = random;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//        System.out.println("Trying to sort.");
//        System.out.println();
//        bubbleSortMy(array);
//
//        System.out.println("try selectSort.");
//        selectSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
