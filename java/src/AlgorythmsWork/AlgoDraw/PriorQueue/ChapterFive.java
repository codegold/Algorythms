package src.AlgorythmsWork.AlgoDraw.PriorQueue;

public class ChapterFive {
    public static void main(String[] args) {
        LaforePriorityQueue myQueue = new LaforePriorityQueue();
        myQueue.insert(55);
        myQueue.insert(77);
        myQueue.insert(11);
        myQueue.insert(99);

        myQueue.display();

        long temp = myQueue.peekMin();
        System.out.println("min is: " + temp);

        myQueue.remove();
        myQueue.remove();

        myQueue.display();

        myQueue.insert(444);
        myQueue.insert(888);
        myQueue.insert(555);

        myQueue.display();

        Link answer = myQueue.remove();
        System.out.println(answer.dData);

        answer = myQueue.remove();
        System.out.println(answer.dData);

        answer = myQueue.remove();
        System.out.println(answer.dData);

        answer = myQueue.remove();
        System.out.println(answer.dData);

//        answer = myQueue.remove();
//        System.out.println(answer.dData);

        System.out.println("Finally: ");
        myQueue.display();
    }
}
