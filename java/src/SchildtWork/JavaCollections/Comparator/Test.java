package JavaCollections.Comparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Jonny");
        names.add("Zoe");
        names.add("Tony");
        names.add("Artie");

        List<Integer> intList = new ArrayList<>();

        intList.add(2);
        intList.add(1111);
        intList.add(222);
        intList.add(555);

        Collections.sort(intList);
        System.out.println(intList);

        Collections.sort(names, new StringLengthComparator());
        System.out.println(names);
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()){
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

class IntegerLengthComparator