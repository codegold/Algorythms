package src.SchildtWork.JavaCollections.ArrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        arrayList.remove(2);
        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList);


//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

            //FOREACH

//        for(Integer s : arrayList){
//            System.out.println(s);
//        }
    }
}
