package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestLinkedTreeAndHash {
    public static void main(String[] args) {
        Map<Integer, String> myHashMap = new HashMap<>();
        Map<Integer, String> myLinkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> myTreeMap = new TreeMap<>();

        testMethods(myHashMap);
        System.out.println();
        testMethods(myTreeMap);
        System.out.println();
        testMethods(myLinkedHashMap);

    }

    public static void testMethods (Map<Integer, String> myMap) {
        myMap.put(1, "Jammie Lanister");
        myMap.put(10, "Sersei Lanister");
        myMap.put(555, "John Snow");
        myMap.put(7000, "Arja Stark");
        myMap.put(2, "Denny");

        for (Map.Entry<Integer, String> myEntry : myMap.entrySet()) {
            System.out.println(myEntry.getKey() +":"+ myEntry.getValue());
        }

    }
}
