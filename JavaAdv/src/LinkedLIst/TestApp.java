package LinkedLIst;

public class TestApp {
    public static void main(String[] args) {
        MyLinkedLIst myLinkedLIst = new MyLinkedLIst();
        myLinkedLIst.add(1);
        myLinkedLIst.add(2);
        myLinkedLIst.add(23);

        System.out.println(myLinkedLIst);

        System.out.println();
        System.out.println(myLinkedLIst.get(0));
        System.out.println(myLinkedLIst.get(1));
        System.out.println(myLinkedLIst.get(2));

        System.out.println();
        myLinkedLIst.remove(1);
        System.out.println(myLinkedLIst);
    }
}
