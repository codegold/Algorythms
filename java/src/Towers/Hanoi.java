package src.Towers;

public class Hanoi {

    static int nDisks = 4;

    public static void main(String[] args) {
        hanoi(3, 1, 2);
    }

    private static void hanoi(int n, int i, int k) {//h = height, i - from, k - to
        if (n == 1)
            System.out.printf("Move disk 1 from pin %d to %d.\n", i, k);
        else {
            int tmp = 6 - i - k;
            hanoi(n - 1, i, tmp);
            System.out.printf("Move disk %d from pin %d to %d.\n", n, i, k);
            hanoi(n-1, tmp, k);
        }
    }
}
