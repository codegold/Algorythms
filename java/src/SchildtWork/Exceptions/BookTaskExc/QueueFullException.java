package Exceptions.BookTaskExc;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    @Override
    public String toString() {
        return "\n Очередь заполнена. Макc размер очереди: " + size;
    }
}
