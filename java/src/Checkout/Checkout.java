package src.Checkout;

import src.Queue.Queue;

import java.io.IOException;

public class Checkout {
    private int numQueues;
    private int maxQueSize;
    private Queue[] queues;
    private Queue fastLine; //An optional 10-items-or-less line?

    private long base;//Time to tender cash/credit expressed as a multiple
    //of time to ring up one item;

    private double percent; //chance of generating a new customer at each step,
    // keep low!

    public Checkout(int nQueues, int nSize, boolean fast) {
        numQueues = nQueues;
        maxQueSize = nSize;
        queues = new Queue[numQueues];

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
                if (queues[shortest].runningTally <= 0)
                    queues[shortest].justAdded = true;
            }
        }
    }

    public void process(int time) { //pass a given amount of time and update queues
        for (int i = 0; i < time; i++) { //do a bunch of operations for each time-tick

            for (int j = 0; j < queues.length; j++) {//go through each queue and update
                if (queues[i].runningTally <= 0) { //if cashier has finished customer

                    //remove front customer and get new one
                    if (!queues[j].isEmpty() && !queues[j].justAdded)
                        queues[j].remove();
                    queues[j].runningTally = queues[j].peekFront();
                } else queues[j].runningTally--; //decrement runningTally for each tick
                queues[j].justAdded = false; //after 1 tick, any new items can be processed
            }
            if (fastLine != null) {
                if (fastLine.runningTally <= 0) {
                    if (!fastLine.isEmpty() && !fastLine.justAdded) fastLine.remove();
                    fastLine.runningTally = fastLine.peekFront();
                } else fastLine.runningTally--;
                fastLine.justAdded = false;
            }
            if ((Math.random() * 100) <= percent) //every tick, possibly generate new customer
                addCustomer();
        }
    }

    public void display() {
        for (int i = 0; i < queues.length; i++) {
            System.out.print("Line " + (i + 1) + ": ");
            queues[i].display();
            System.out.println("   -Running Tally: " + queues[i].runningTally);
        }
        if (fastLine != null) {
            System.out.print("Fast Lane: ");
            fastLine.display();
            System.out.println("   -Running Tally: " + fastLine.runningTally);
        }
    }

    public void initialize() throws NullPointerException, IOException { //start with a bunch of random customers
        for (int i = 0; i < queues.length; i++) {
            for (int j = 0; j < (Math.floor(Math.random() * 4)+1); j++) {
                queues[i].insert((long) Math.ceil(Math.random() * 30));
            }
            queues[i].runningTally = queues[i].peekFront();//get started on first customer
        }
        if (fastLine != null) {

            for (int j = 0; j < (Math.floor(Math.random() * 4)+1); j++) {
                fastLine.insert((long) Math.ceil(Math.random() * 10));
            }
            fastLine.runningTally = fastLine.peekFront(); //get started on first customer
        }
    }
}