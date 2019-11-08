package src.HighArrayApp;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;

        HighArray arr = new HighArray(maxSize);

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
        int searchKey = 22;
        System.out.println("try to found "+searchKey);
        if(arr.find(searchKey))
            System.out.println("Founded "+ searchKey);
        else System.out.println("Can't found "+ searchKey);

        System.out.println("Delete 00, 66, 99");
        arr.delete(00);
        arr.delete(66);
        arr.delete(99);

        arr.display();
        System.out.println("Try removeMax().");
        arr.removeMaxTwo();
        arr.display();
        arr.removeMaxTwo();
        arr.display();

    }


}
