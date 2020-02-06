package src.AlgorythmsWork.AlgoDraw.CheckoutVerTwo;

import java.util.Scanner;

public class CheckOutAppTwo {
    public static void main(String[] args) {
        int nLines = 1; // Total no of Line
        int maxLineLength = 3; // Total no of customers allowed in the line
        int processPerMin = 2;// Item Processed/Min
        int incLength = 1; // Increment time always by 1
        int maxItems = 10; // Max item that can be bought by the customer
        int choice;

        CheckOutTwo checkOutTwo = new CheckOutTwo(nLines, maxLineLength, processPerMin, maxItems);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. To Add a Customer");
            System.out.println("2. To Increment Time");
            System.out.println("3. Quit");
            choice = scanner.nextInt();

            switch (choice){
                case 1: checkOutTwo.addCustomer(); break;
                case 2: checkOutTwo.incrementTime(incLength); break;
                case 3: return;
                default:
                    System.out.println("Invalid input. Please try again");
            }
        }
    }
}
