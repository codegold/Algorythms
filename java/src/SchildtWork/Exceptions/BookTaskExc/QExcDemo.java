package Exceptions.BookTaskExc;

public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        //try over stack
        try {
            for (int j = 0; j < 11; j++) {
                System.out.print("Try to save: " + (char) ('A' + j));
                q.put((char) ('A' + j));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();

        //try get from empty
        try {
            for (int j = 0; j < 11; j++) {
                System.out.print("Получение очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
    }
}
