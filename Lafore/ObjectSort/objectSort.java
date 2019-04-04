package Lafore.ObjectSort;

class objectSort {
    private String lastName;
    private String firstName;
    private int age;

    //---------------------------------------------------------------------------

    public objectSort(String last, String first, int a) {           //Constructor
        firstName = first;
        lastName = last;
        age = a;
    }
    //---------------------------------------------------------------------------

    public void displayPerson() {
        System.out.print("Last name: " + lastName);
        System.out.print(".  First name: " + firstName);
        System.out.println(". Age: " + age);
    }
    //---------------------------------------------------------------------------

    public String getLast() {
        return lastName;
    }
}
/////////////////////////////////////////////////////////////////////////////////

class ArrayInOb {
    private objectSort[] a;
    private int nElems;

    //-----------------------------------------------------------------------

    public ArrayInOb(int max) {                                 //Constructor
        a = new objectSort[max];
        nElems = 0;
    }
//-------------------------------------------------------------------------------

    public void insert(String last, String first, int age) {
        a[nElems] = new objectSort(last, first, age);
        nElems++;
    }
//-------------------------------------------------------------------------------

    public void display() {
        for (int i = 0; i < nElems; i++) {
            a[i].displayPerson();   //попробовать sout a[i] =  " "
            System.out.println(" ");
        }
    }
//-------------------------------------------------------------------------------

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            in = out;
            objectSort temp = a[out];
            while (in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0) ;
            {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}


class ObjectSortApp {
    public void main(String[] args) {
        int maxSize = 100;                                       //Array size
        ArrayInOb arr = new ArrayInOb(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        System.out.println("Before sorting:");
        arr.display();
        arr.insertionSort();
        arr.display();
    }
}

/////////////////////////////////////////////////////////////////////////////////



