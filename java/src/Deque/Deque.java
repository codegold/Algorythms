package src.Deque;

public class Deque {
    private int maxSize;
    private long[] queArray;
    private int left;
    private int right;
    private int nItems;


    public Deque(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
        left = 0;
        right = 1;
    }


    public Boolean isFull() {
        if (nItems == maxSize) return true;
        else return false;
    }

    public Boolean isEmpty() {
        if (nItems == 0) return true;
        else return false;
    }

    public long peekRight() {
        return queArray[right];
    }

    public long peekLeft() {
        return queArray[left];
    }

    public void insertLeft(long value) {
        if (!isFull()) {
            left--;
            if (left < 0) left = maxSize - 1;
            queArray[left] = value;
            nItems++;
        } else System.out.println("Deque (queue) is full!");
    }

    public void insertRight(long value) {
        if (!isFull()) {
            right++;
            if (right >= maxSize) right = 0;
            queArray[right] = value;
            nItems++;
        } else System.out.println("It's full!");
    }

    public long removeLeft() {
        if (!isEmpty()) {
            long temp = queArray[left];
            left++;
            if (left >= maxSize) {
                left = 0;
                nItems--;
                return temp;
            }
        } else System.out.println("Empty");

        return -1;
    }

    public long removeRight() {
        if (!isEmpty()) {
            long temp = queArray[right];
            right--;
            if (right < 0) right = maxSize - 1;
            nItems--;
            return temp;
        } else System.out.println("It's empty.");
        return -1;
    }

    public void display() {
        System.out.println("Left is: " + left + "Right is: " + right);
        int index = left;
        for (int i = 0; i < nItems; i++) {
            if (index >= maxSize) index = 0;
            System.out.print(queArray[index] + " ");
            index++;
        }
        System.out.println();
    }


}
