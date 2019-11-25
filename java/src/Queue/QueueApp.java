package src.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.isEmpty();

        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(55);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.display();
        System.out.println();

        queue.insert(66);
        queue.insert(77);
        queue.insert(88);

        queue.isFull();

        while (!queue.isEmpty()){
            long n = queue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();
    }
}
