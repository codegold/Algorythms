import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTests {
    public static void main(String[] args) {
        List<Integer> myLinkedList = new LinkedList<>();
        List<Integer> myArrayList = new ArrayList<>();

        measureTime(myLinkedList);
        measureTime(myArrayList);
    }

    private static void measureTime(List<Integer> list) {


        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

//        for (int i = 0; i < 100000; i++) {
//            list.get(i);
//        }


        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
