package Lafore.ObjectSort;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    //---------------------------------------------------------------------------

    public Person(String last, String first, int a) {               //Constructor
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
