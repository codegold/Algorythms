package src.MyLink;

import src.Link.Link;

public class MyLink {
    int data;
    double dData;
    MyLink next;

    public MyLink(int data, double dData) {
        this.data = data;
        this.dData = dData;
        next = null;
    }

    public void displayLink() {
        System.out.print("data = " + data + " dData = " + dData);
        System.out.println();
    }
}

class MyLinkList {
    private MyLink first;

    public MyLinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public MyLink insertFirst(int i, double d) {
        MyLink myLink = new MyLink(i, d);
        myLink.next = first;
        first = myLink;
        return first;
    }

    public MyLink deleteFirst() {
        MyLink temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        MyLink curr = first;
        if (curr != null) {
            while (curr != null) {
                curr.displayLink();
                curr = curr.next;
            }
        } else {
            System.out.println("MyLinkList is empty");
        }
    }

}

class MyLinkListApp {
    public static void main(String[] args) {
            MyLinkList myLinkList = new MyLinkList();
            myLinkList.insertFirst(2,22.33);
            myLinkList.insertFirst(3,33.33);

            myLinkList.displayList();

            while (!myLinkList.isEmpty()){
                myLinkList.deleteFirst().displayLink();
            }
        System.out.println("rrr");
            myLinkList.displayList();
    }
}
