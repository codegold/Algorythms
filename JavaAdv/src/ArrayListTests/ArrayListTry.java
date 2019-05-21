package ArrayListTests;

import java.util.ArrayList;

public class ArrayListTry {
    public static void main(String[] args) {

        ArrayList<Integer> myArrList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            myArrList.add(i);
        }

        System.out.println(myArrList.get(3));

        for (int i = 0; i < myArrList.size(); i++){
            System.out.print(myArrList.get(i) + "  ");
        }

        for (Integer integer : myArrList) {
            System.out.print(myArrList.get(integer) + ",");
        }
        System.out.println();
    }
}
