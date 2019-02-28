package Linear;

import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
        int[] azs = {1, 20, 35, 55, 95};
        System.out.println(maxNumber(azs));
    }

    public static String maxNumber(int[] azs) {
        Arrays.sort(azs);
        String s = "";
        for (int i = azs.length - 1; i >= 0; i--)
            s += azs[i];
        return s;

    }
}
