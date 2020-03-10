package JavaCollections.MyLinedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedLIst myLinkedLIst = new MyLinkedLIst();
        myLinkedLIst.add(1);
        myLinkedLIst.add(2);
        myLinkedLIst.add(10);

        System.out.println(myLinkedLIst);

        System.out.println(myLinkedLIst.get(0));
        System.out.println(myLinkedLIst.get(10));
    }
}
