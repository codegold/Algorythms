package JavaCollections.Stream;

import java.util.List;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        int[] arr = {120, 410, 85, 32, 314, 12};
        IntStream.of(arr)
                .filter(a -> a < 1000)
                .filter(b -> b > 50)
                .map(c -> c + 10000)
                //.limit(10500)
                .forEach(System.out::println);
    }
}
