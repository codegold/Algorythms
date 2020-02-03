package src.StackTriangle;

public class StackX {
    private int maxSize;
    private Params[] stackArray;
    private  int top;

    public StackX (int s) {
        maxSize = s;// Определение размера массива
        stackArray = new Params[maxSize];// Создание массива
        top = -1;// Массив пока не содержит элементов
    }

    public void push(Params p) { // Размещение элемента на вершине стека
        stackArray[++top] = p; // Увеличение top, вставка элемента
    }
}
