package JavaCollections.ArrayListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayListQ = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayListQ.add(i);
        }

        System.out.println(arrayListQ);

        System.out.println(arrayListQ.get(0));
        arrayListQ.remove(2);
        arrayListQ.remove(2);
        System.out.println(arrayListQ.size());
        System.out.println(arrayListQ);


//        for (int i = 0; i < arrayListQ.size(); i++) {
//            System.out.println(arrayListQ.get(i));
//        }

        //FOREACH

//        for(Integer s : arrayListQ){
//            System.out.println(s);
//        }

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        System.out.println("here");

        measureTime(linkedList);
        measureTime(arrayList);

    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
