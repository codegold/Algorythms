package src.Towers;

public class Solution {
    public static int recursion(int n) {
        // условие выхода
        // Базовый случай
        // когда остановиться повторять рекурсию ?
        if (n == 1) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) * n;
    }
    public static void main(String[] args) {
        System.out.println(recursion(5)); // вызов рекурсивной функции
    }
}