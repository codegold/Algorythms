package JavaCollections.Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <String> list = new ArrayList();
        list.add("Hello");
        list.add(String.valueOf(123));
        //String text = list.get(0) + ", world!";
        //String text = list.get(0);
        for(Object str: list){
            System.out.println("-" + (String) str);
        }
    }
}
