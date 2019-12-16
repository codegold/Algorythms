package src.ListInsertionSort;

public class ListInsertSortApp {
    public static void main(String[] args) {
        int size = 10;
        Link[] linkArray = new Link[size];

        for (int i = 0; i < size; i++) {
            int n = (int) (java.lang.Math.random() * 99);
            Link newLink = new Link(n);
            linkArray[i] = newLink;
        }
    }
}
