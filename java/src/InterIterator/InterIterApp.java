package src.InterIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIterApp {
    public static void main(String[] args) throws IOException {
        LinkList theList = new LinkList();
        ListIterator iter1 = theList.getIterator();
        long value;

        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);

        while (true) {
            System.out.print("Enter first letter of show, reset, ");
            System.out.print("next, get, before, after, delete: ");
            System.out.flush();

            int choice = getChar();
            switch (choice) {
                case 's':
                    if (!theList.isEmpty())
                        theList.displayList();
                    else
                        System.out.println("List is empty.");
                    break;
                case 'r':
                    iter1.reset();
                    break;
                case 'n':
                    if (!theList.isEmpty() && !iter1.atEnd())
                        iter1.nextLink();
                    else
                        System.out.println("Can't go next link.");
                    break;
                case 'g':
                    if (!theList.isEmpty()) {
                        value = iter1.getCurrent().dData;
                        System.out.println("Returned " + value);
                    } else
                        System.out.println("List is Empty.");
                    break;
            }
        }
    }

    private static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
