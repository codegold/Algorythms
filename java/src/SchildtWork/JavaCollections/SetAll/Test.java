package JavaCollections.SetAll;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeHashSet = new TreeSet<>();

        hashSet.add("Aaron");
        hashSet.add("Kate");
        hashSet.add("Julia");
        hashSet.add("Zoe");
        hashSet.add("Zoe");

        linkedHashSet.add("Aaron");
        linkedHashSet.add("Kate");
        linkedHashSet.add("Julia");
        linkedHashSet.add("Zoe");
        linkedHashSet.add("Zoe");

        treeHashSet.add("Aaron");
        treeHashSet.add("Kate");
        treeHashSet.add("Julia");
        treeHashSet.add("Zoe");
        treeHashSet.add("Zoe");

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeHashSet);

        System.out.println();

        for(String s : linkedHashSet){
            System.out.print(s+ " ");
        }

        System.out.println();
        System.out.println(hashSet.contains("Tin"));
        System.out.println(hashSet.contains("Kate"));


        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);

        Set<Integer> mySet2 = new HashSet<>();
        mySet2.add(3);
        mySet2.add(4);
        mySet2.add(5);
        mySet2.add(6);
        mySet2.add(7);

        Set<Integer> mySetUnion = new HashSet<>(mySet);


        mySetUnion.removeAll(mySet2);
        System.out.println(mySetUnion);
    }
}
