package Test;

import java.lang.String;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamText {
    public static void main(String[] args) throws IOException {
        List<String> states = new ArrayList<>();
        states.add("Alabama");
        states.add("Massachusetts");
        states.add("California");
        states.add("Florida");
        states.add("Carolina");
        states.add("Montana");
        states.add("Chicago");

        for (String s : states) {
            System.out.println(s);
        }

        



    }
}
