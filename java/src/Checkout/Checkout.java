package src.Checkout;

import src.Queue.Queue;

public class Checkout {
    private int numQueues;
    private int maxQueSize;
    private Queue[] queues;
    private Queue fastLane; //An optional 10-items-or-less line?

    private long base;//Time to tender cash/credit expressed as a multiple
    //of time to ring up one item;

    private double percent; //chance of generating a new customer at each step,
    // keep low!

    public Checkout(int numQueues, int size, boolean fast) {
        this.numQueues = numQueues;
        maxQueSize = size;
        queues = new Queue[maxQueSize];

        if (fast) fastLane = new Queue(maxQueSize);
        for (int i = 0; i < numQueues; i++) {
            queues[i] = new Queue(maxQueSize);
        }
        base = 15;
        percent = 10;
    }

    //use logic to place a customer with random # of items in a queue
    public void addCustomer() {
        long customer = (long) Math.ceil(Math.random() * 30);//max of 30 items
        int shortest = 0;               //tracks the current best option
        long shortestLength = 9999; //tracks the minimum length during loops
        long temp = 0;

        //If there's a fast lane, consider using it
        if (fastLane != null && customer <= 10) {
            temp = base * fastLane.size();
            for (int i = 0; i < fastLane.size(); i++) {
                temp += fastLane.itemAt(i);
                if (shortestLength > temp) {
                    shortest = -1;
                    shortestLength = temp;
                }
            }
            //Check all the regular lanes too
            for (int i = 0; i < queues.length; i++) {

            }
        }

    }
}
