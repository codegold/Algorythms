package src.Checkout;

import src.Queue.Queue;

public class Checkout {
    private int numQueues;
    private int maxQueSize;
    private Queue[] queues;
    private Queue fastLine; //An optional 10-items-or-less line?

    private long base;//Time to tender cash/credit expressed as a multiple
    //of time to ring up one item;

    private double percent; //chance of generating a new customer at each step,
    // keep low!

    public Checkout(int numQueues, int size, boolean fast) {
        this.numQueues = numQueues;
        maxQueSize = size;
        queues = new Queue[maxQueSize];

        if (fast) fastLine = new Queue(maxQueSize);
        for (int i = 0; i < numQueues; i++) {
            queues[i] = new Queue(maxQueSize);
        }
        base = 15;
        percent = 10;
    }

    //use logic to place a customer with random # of items in a queue
    public void addCustomer() {
        long customerBuying = (long) Math.ceil(Math.random() * 30);//max of 30 items
        int shortest = 0;               //tracks the current best option
        long shortestLength = 9999; //tracks the minimum length during loops
        long temp = 0;

        //If there's a fast lane, consider using it
        if (fastLine != null && customerBuying <= 10) {
            temp = base * fastLine.size();
            for (int i = 0; i < fastLine.size(); i++) {
                temp += fastLine.itemAt(i);
                if (shortestLength > temp) {
                    shortest = -1;
                    shortestLength = temp;
                }
            }
            //Check all the regular lanes too
            for (int i = 0; i < queues.length; i++) {
                temp = base * queues[i].size();

                for (int j = 0; j < queues[i].size(); j++)
                    temp += queues[i].itemAt(j);
                if (shortestLength > temp) {
                    shortest = i;
                    shortestLength = temp;
                }
            }
            if (shortest == -1) {
                //if fast lane is best choice, add customer there and return
                fastLine.insert((int) customerBuying);
                System.out.println("Customer buying " + customerBuying + "Added to fast Line");
                //prevent process() from deleting new customer when queue is empty
                fastLine.justAdded = true;
            } else {//otherwise add the customer to the shortest regular line
                queues[shortest].insert((int) customerBuying);
                System.out.println("Customer buyings " + customerBuying +
                        " added to line " + (shortest + 1));
                //prevent process() from deleting new customer when queue is empty
                if(queues[shortest].runningTally <= 0)

            }
        }
