package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Donald");
        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Donald");

        for (String name: hashSet) {
            System.out.println(name);
        }

        System.out.println(hashSet);

//        for(String name: hashSet) {
//            System.out.println(name);
//        }

        System.out.println();
//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.contains("Tim"));
//        System.out.println(hashSet.isEmpty());
    }
}
