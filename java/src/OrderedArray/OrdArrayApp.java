package src.OrderedArray;

public class OrdArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);
        OrdArray arr2 = new OrdArray(maxSize);
        OrdArray arr3 = new OrdArray(20);
        OrdArray arr4 = new OrdArray(20);
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
        System.out.print("After book way: ");
        arr.display();

        System.out.println("Now my arr2");
        arr2.simpleInsert(10);
        arr2.simpleInsert(2);
        arr2.simpleInsert(7);
        arr2.simpleInsert(5);
        System.out.print("After my unsorted test: ");
        arr2.display();
        System.out.println();
        int searchKey = 55;


        if (arr.find(searchKey) != arr.size())
            System.out.println("We founded: " + searchKey);
        else System.out.println("Can't find this: " + searchKey);

        arr.display();
        arr.delete(00);
        arr.delete(22);
        arr.delete(11);
        arr.insert(16);
        arr.display();
        System.out.println(arr.find(77));

        //------------------------------------------------------
        //Exercise 5:
        System.out.println("Exercise 5");
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random()*100);
            arr3.insert(random);
        }
        System.out.println("This is arr3 :");arr3.display();

        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random()*200);
            arr4.insert(random);
        }

    }
}
