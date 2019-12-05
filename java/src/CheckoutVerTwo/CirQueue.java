package src.CheckoutVerTwo;

public class CirQueue {
    private int max, rear, front;
    private int[] arr;
    private int size;

    public CirQueue(int m) {
        max = m;
        size = 0;
        arr = new int[max];
        rear = front - 1;
    }

    public void insert(int val) {
        if (isFull()) {
            System.out.println("CUSTOMER CANNOT BE ADDED. QUEUE IS FULL");
        } else {
            if (isEmpty()) {
                front = rear = 0;
                arr[rear] = val;
            } else {
                rear = (rear + 1) % max;
                arr[rear] = val;
            }
            size++;
        }
    }

    public void decFront(int val) {
        arr[front] -= val;
        if (arr[front] <= 0) {
            delete();
        }
    }

    public void display() {
        if (isEmpty()) {
            int i;
            for (i = front; i != rear; i = (i + 1) % max) {
                System.out.print(arr[i] + " ");
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int delete() {
        if (isEmpty()) {
            System.out.println("Empty.");
            return -1;
        } else {
            int temp = arr[front];
            if (rear == front) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % max;
            }
            size--;
            return temp;
        }
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return front == (rear + 1) % max;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

}