package Linear;


import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
        int[] numbers = {1, 20, 35, 55, 95};
        System.out.println(numbersCount(numbers));
    }

    public static String numbersCount(int[] numbers) {
        Arrays.sort(numbers);
        String s = "";
        for (int i = numbers.length - 1; i >= 0; i--)
            s += numbers[i];
        return s;
    }
}
