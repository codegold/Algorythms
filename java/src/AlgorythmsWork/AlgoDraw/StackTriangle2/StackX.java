package src.AlgorythmsWork.AlgoDraw.StackTriangle2;

// stackTriangle2.java
// Вычисление треугольных чисел (стек вместо рекурсии)
// Запуск программы: C>java StackTriangle2App
public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int p) {
        stackArray[++top] = p;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
