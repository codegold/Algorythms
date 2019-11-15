package src.BubbleSort;

public class BubbleSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr = new ArrayBub(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();

        arr.bubbleSortThree();
        arr.display();

        System.out.println("Create arr2");
        ArrayBub arr2 = new ArrayBub(maxSize);
        arr2.fulfillArray();
//        arr2.insert(77);
//        arr2.insert(99);
//        arr2.insert(44);
//        arr2.insert(55);
//        arr2.insert(22);
//        arr2.insert(88);
//        arr2.insert(11);
//        arr2.insert(00);
//        arr2.insert(66);
//        arr2.insert(33);
        arr2.display();
        System.out.println("arr2 After fullfill.");
        System.out.println("after display");
        arr2.bubbleSortThree();
        arr2.display();
        System.out.println("bubbleSortThree");

    }
}
