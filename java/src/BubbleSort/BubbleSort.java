package src.BubbleSort;

public class BubbleSort {
    static int[] array = new int[10];

    public static void bubbleSortMy(int[] array) {
        int finish = array.length - 1;
        for (int i = finish; i > 0; i--) {
            for (int j = 0; j < finish; j++)
                if (array[i] > array[j]) {
                    for (int k = j; k <= finish; k++)
                        array[i] = array[i + 1];
                } else {
                i++;
                }
            finish--;


        }
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

        System.out.println("Trying to sort.");
        System.out.println();
        bubbleSortMy(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
