package src.AlgorythmsWork.AlgoDraw.ObjectSort;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print(" lastname is: " + lastName);
        System.out.print(" firstName is: " + firstName);
        System.out.println(" Age is: " + age);
    }

    public String getLast() {
        return lastName;
    }
}
