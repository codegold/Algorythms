package src.AlgorythmsWork.AlgoDraw.RecursionSomeTasks;

//Дано натуральное число n. Выведите все числа от 1 до n.
//
//Ввод	Вывод
//5
//1 2 3 4 5

public class TaskOne {

    public static int recurs(int n) {

        if (n == 1) {
            System.out.print(" 1 ");
            return 1;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" ");
        }

        return recurs(n - 1) * n;
    }


    public static void main(String[] args) {
        System.out.println(recurs(5) + " ");
    }
}
