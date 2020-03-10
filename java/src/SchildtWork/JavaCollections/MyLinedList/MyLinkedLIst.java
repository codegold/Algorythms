package JavaCollections.MyLinedList;

import javax.xml.soap.Node;
import java.util.Arrays;

public class MyLinkedLIst {
    private Node head;
    private int size;

    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    @Override
    public String toString() {
        int[] result = new int[size];

        int indx = 0;
        Node temp = head;

        while (temp != null) {
            result[indx++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    private static class Node {
        private Node next;
        private int value;


        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
