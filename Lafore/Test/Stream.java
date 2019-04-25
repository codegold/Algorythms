package Test;

import java.io.IOException;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.*;


public class Stream {
    public static void main(String[] args) throws IOException {
//        String[] names = {"Max", "Mike", "Michael", "Jeff", "Jessie"};
//        Arrays.stream(names)
//                .filter(x -> x.startsWith("J"))
//                .sorted()
//                .forEach(System.out::println);


        int[] myArray = {2, 4, 6, 8, 10};//new int[10];
        Arrays.stream(myArray).map(x -> x * 10).average().ifPresent(System.out::println);

        List<String> people = Arrays.asList("Hans", "Harold", "Harry", "Bob", "Billy");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("h"))
                .forEach(System.out::println);
    }

}