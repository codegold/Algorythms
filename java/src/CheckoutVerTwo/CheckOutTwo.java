package src.CheckoutVerTwo;

import src.Checkout.Checkout;

import java.util.Random;

public class CheckOutTwo {
    private int processPerMin, time;
    private int maxItems;
    private CirQueue[] lines;


    public CheckOutTwo(int nLines, int maxLineLength, int processPerMin, int maxItems) {
        this.processPerMin = processPerMin;
        this.maxItems = maxItems;
        this.time = 0;

        lines = new CirQueue[nLines]; // Initialize all the lines to zero (Start)
        for (int i = 0; i < nLines; i++) {
            lines[i] = new CirQueue(maxLineLength);
        }
    }

    public void addCustomer() {
        time++;
        // Shortest Line
        int shortestLine = 0;
        int minSize = lines[0].size();
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].size() < minSize) {
                minSize = lines[i].size();
                shortestLine = i;
            }
        }

        // Add the Customer to the Shortest Line

        Random random = new Random();
        int items = random.nextInt(maxItems) + 1;
        lines[shortestLine].insert(items);

        display();
    }

    private void display() {
        System.out.println("Time (min): " + time);
        for (int i = 0; i < lines.length; i++) {
            System.out.print("Line " + i + " (size: " + lines[i].size() + "): ");
            lines[i].display();
        }
        System.out.println("______________");
    }

    public void incrementTime(int incLength) {
        time += incLength;

        for (CirQueue line : lines) {
            if (line.isEmpty()) {  // skip empty queues
                continue;
            }

            line.decFront(processPerMin); // decrement item count
        }

        display();
    }
}
