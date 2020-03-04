package src.SchildtWork.Part11Concurrency.Alishev.Lambda2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("goodbye");
        list.add("a");
        list.add("ab");

        Comparator<String> comparator = ((o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            else if (o2.length() > o1.length()) return -1;
            else return 0;
        });

//        list.sort((o1,o2) -> {
//            if (o1.length() > o2.length()) return 1;
//            else if (o2.length() > o1.length()) return -1;
//            else return 0;
//        });

        list.sort(comparator);
        System.out.println(list);
    }
}
