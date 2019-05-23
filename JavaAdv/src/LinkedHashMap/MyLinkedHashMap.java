package LinkedHashMap;

import java.util.HashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> translations = new HashMap<>();
        translations.put("cat", "purr purr animal");
        translations.put("dog", "woof woof animal");
        translations.put("tiger", "rrrrr animal");

        for(Map.Entry<String, String> entry: translations.entrySet()) {
            System.out.println(entry.getKey()+ ":" +entry.getValue());
        }
    }
}
