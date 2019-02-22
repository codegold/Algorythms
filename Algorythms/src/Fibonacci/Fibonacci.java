package Fibonacci;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];

        Arrays.fill(mem, -1);

        System.out.println(fibNaive(n, mem));
        System.out.println(fibEffective(9));

    }

    private static long fibNaive(int n, long[] mem) {
        if(mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;

        long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = result;
        return result;
    }

    private static long fibEffective(int n) {
        long[] arr = new long[n + 1]; //создадим массив

        arr[0] = 0; //По определению Фибоначчи первые два числа 0 и 1 соответственно
        arr[1] = 1;

        //Идем по массиву и складываем 2 предыдущих числа
        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2]; //3 = (3-1) + (3-2) =
            // чтобы получить число на поз 3 мы вычтем 1 из поз 1 и вычтем 2 из позиции 0

        return arr[n];

    }
}


