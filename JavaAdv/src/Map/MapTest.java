package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map);

        for (Map.Entry<Integer, String> myEntry : map.entrySet()) {
            System.out.println(myEntry.getKey() + ":" + myEntry.getValue());
        }
    }
}
