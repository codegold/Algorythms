package JavaCollections.Generics;

import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static class Util {
        public static <String> String getValue(Object obj, Class<String> clazz) {
            return (String) obj;
        }

        public static <String> String getValue(Object obj) {
            return (String) obj;
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("Author", "Book");
        for(Object elem: list){
            String data = Util.getValue(elem, String.class);
            System.out.println(data);
            System.out.println(Util.<String>getValue(elem));
        }
        List list2 = Arrays.asList(2,3,5);
        for(Object elem : list2){
            System.out.println(elem);
        }
    }
}
