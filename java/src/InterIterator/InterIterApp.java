package src.InterIterator;

public class InterIterApp {
    public static void main(String[] args) {
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
                    if(!theList.isEmpty())
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
                    if(!theList.isEmpty()){
                        value = iter1.getCurrent().dData;
                        System.out.println("Returned " + value);
                    }
                    else
                        System.out.println("List is Empty.");
                    break;


            }
        }
    }

    private static char getChar() {
        return 0;
    }
}
