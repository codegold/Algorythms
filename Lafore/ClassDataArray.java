package Lafore;

class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPerson() {
        System.out.print("Last name: " + lastName);
        System.out.print("First name: " + firstName);
        System.out.println("Age: " + age);
    }

    public String getLast() {
        return lastName;
    }
}

public class ClassDataArray {
    private Person[] a;                 //Link to array.s
    private int nElems;                 //Quantity elements.

    public ClassDataArray(int max) {    //Constructor.
        a = new Person[max];            //Create array.
        nElems = 0;
    }

    public Person find(String searchName) {         //Searching for name.
        int j;
        for (j = 0; j < nElems; j++)                //Searching for each element.
            if (a[j].getLast().equals(searchName))  //Founded?
                break;
        if (j == nElems)                            //Reached last element?
            return null;                            //Yes. Founded.
        else                                        //No.
            return a[j];
    }

    //Adding to array.
    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    //Delete from array.
    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++)                 //Searching for name.
            if (a[j].getLast().equals(searchName))
                break;
        if (j == nElems)
            return false;                            //Not found.
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }

    public void displayA() {                //Show all array.
        for (int j = 0; j < nElems; j++)    //For each element.
            a[j].displayPerson();           //Show.
    }
}

class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray arr = new ClassDataArray(maxSize);
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

        arr.displayA(); // Вывод содержимого.

        String searchKey = "Stimson";
        Person found = arr.find(searchKey);
        if (found != null) {
            System.out.print("Found: ");
            found.displayPerson();
        } else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Smith, Yee, and Creswell.");
        arr.delete("Smith");              //Deleting 3 elements.
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.displayA();                              //Show renewed arr.
    }
}
