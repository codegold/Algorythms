package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");

//        for (String s : myList)
//            System.out.println(s);
//        System.out.println();

        Stream<String> myStream = myList.stream();
        System.out.println(myStream);
//        myStream.forEach(x -> System.out.println(x));
//        System.out.println();

        myList.stream().forEach(x -> System.out.println(x + " hello!"));

        System.out.println();

        System.out.println(
        IntStream.range(1, 8).skip(5).sum());
        System.out.println();
    }
}