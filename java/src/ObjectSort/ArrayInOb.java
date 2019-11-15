package src.ObjectSort;

public class ArrayInOb {
    private Person[] a;
    private int nElems;

    public ArrayInOb(int max) {
        a = new Person[max];
        nElems = 0;
    }

    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void display(){
        for (int i = 0; i < nElems; i++) {
            a[i].displayPerson();
            System.out.println("");//Check NAX
        }
    }
}
