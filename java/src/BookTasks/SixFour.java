package src.BookTasks;

/**
 * Chapter 6, Exercise 4: Write a program that solves the knapsack problem
 * for an arbitrary knapsack capacity and series of weights. Assume the weights
 * are stored in an array.
 */

public class SixFour {

    public static double[] sack;

    public static void main(String[] args) {

        sack = new double[]{11, 8, 7, 6, 5};
        if (!knapsack(37, 0))
            System.out.println("No valid combinations");

    }

    public static Boolean knapsack(double targetWeight, int index) {

        Boolean complete = false;
        if (index == sack.length)
            return false;
        if (sack[index] == targetWeight) {
            System.out.print("Answer: " + sack[index] + " ");
            complete = true;
        } //done

        if (sack[index] < targetWeight) {
            //keep going
            complete = knapsack(targetWeight - sack[index], index + 1);
            if (complete) System.out.println(sack[index] + " ");
            for (int i = index++; i < sack.length; i++) {
                if (!complete) complete = knapsack(targetWeight, i);
            }
        }
        if (sack[index] > targetWeight) complete = knapsack(targetWeight, index++);
        return complete;
    }
}
