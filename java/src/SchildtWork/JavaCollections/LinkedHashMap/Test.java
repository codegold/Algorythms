package JavaCollections.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>(); //order  not guaranteed
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //guaranteed
        Map<Integer, String> treeHashMap = new TreeMap<>(); //lexikograph order

        System.out.println("Hash");
        testMap(hashMap);
        System.out.println("Linked");
        testMap(linkedHashMap);
        System.out.println("Tree");
        testMap(treeHashMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(11, "Annie");
        map.put(22, "Katty");
        map.put(33, "Lolo");
        map.put(3333, "Jupiter");
        map.put(11, "Jenny");
        map.put(55, "Zoe");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
