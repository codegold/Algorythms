package src.SchildtWork.Part8Exercises.QDemo;

public class Queue {
    char q[]; //arr to store elems of queue
    int putIndex, getIndex; // индексы для вставки и извлечения
// элементов очереди


    Queue(int size) {
        q = new char[size++]; //memory for queue
        putIndex = getIndex = 0;
    }

    void put(char ch) {
        if (putIndex == q.length - 1) {
            System.out.println(" Queue is full.");
            return;
        }

        putIndex++;
        q[putIndex] = ch;
    }

    char get() {
        if (getIndex == putIndex) { //Check if queue if empty
            System.out.println(" Is full.");
            return 0;
        }

        getIndex++;
        return q[getIndex];

    }
}
