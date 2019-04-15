package Queue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    //----------------------------------------------------------

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    //----------------------------------------------------------

    public void insert(long j) {//Вставка элемента в конец очереди
        if (rear == maxSize - 1)           //Циклический перенос
            rear = -1;
        queArray[++rear] = j;        //Увеличение rear и вставка
        nItems++;              //Увеличение количества элементов
    }
    //----------------------------------------------------------

    public long remove() {//Извлечение элемента в начале очереди
        long temp = queArray[front++];//Выборка и увеличение фронт
        if (front == maxSize)              //Циклический перенос
            front = 0;
        nItems--;//                //Уменьшение кол-ва элементов
        return temp;
    }
    //----------------------------------------------------------

    public long peekFront() {  //Чтение элемента вначале очереди
        return queArray[front];
    }
    //----------------------------------------------------------

    public boolean isEmpty() {          //Тру если очередь пуста
        return (nItems == 0);
    }
    //----------------------------------------------------------

    public boolean ifFull() {       //Тру если очередь заполнена
        return (nItems==maxSize);
    }
    //----------------------------------------------------------

    public int size() {          //Колчиество элемнтов в очереди
        return nItems;
    }
    //----------------------------------------------------------
}


