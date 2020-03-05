package src.SchildtWork.Part11Concurrency.Alishev.Lambda3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {


        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

//        for (int i = 0; i < 10; i++) {
//            list1.set(i, list1.get(i) * 2);
//            arr1[i] = arr1[i] * 2;
//        }

        //MAP method
        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());

        //arr1 = Arrays.stream(arr1).map(a -> 3).toArray();
        arr1 = Arrays.stream(arr1).toArray();
        System.out.println("MAP");


        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        //FILTER method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println("FILTER");
        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        System.out.println("FOREACH");

        Arrays.stream(arr2).forEach(a -> System.out.print(a));
        System.out.println();
        list2.stream().forEach(a -> System.out.print(a));
        System.out.println();

        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillList(list3);
        fillArr(arr3);

        System.out.println("REDUCE");
        int newArr3 = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
        int newList3 = list3.stream().reduce((acc, b) -> acc * b).get();
        System.out.println(newArr3);
        System.out.println(newList3);

        Stream<String> wordStream = Stream.of("one", "two", "three");
        String sentence = wordStream.reduce((x, y) -> x + " " + y).toString();
        System.out.println(sentence);


        int[] arr4 = new int[10];
        fillArr(arr4);

        arr4 = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(s -> s * 10).toArray();
        System.out.println("MIXED METHODS");
        System.out.println(Arrays.toString(arr4));

    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    private static void fillList(List<Integer> list) {

        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}
