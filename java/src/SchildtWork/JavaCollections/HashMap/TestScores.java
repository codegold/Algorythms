package JavaCollections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestScores {
    public static void main(String[] args) {
        Map<Integer, String> scores = new HashMap<>(16);

        scores.put(100, "King");
        scores.put(90, "Blake");
        scores.put(10, "Ford");
        scores.put(10, "Smith");
        scores.put(99, "Ward");
        scores.put(99, "Jones");

        System.out.println(scores);
        System.out.println(scores.get(10));

    }

}
