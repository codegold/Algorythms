package src.Recursion.RecursionSomeTasks.Factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int i) {
        if (i==0)
            return 1;

        else
            return i * factorial(i-1);
    }
}
