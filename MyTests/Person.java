package MyTests;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ivanov", "Artem", 33);
        System.out.println(p1.lastName + " " + p1.firstName + " " + p1.age);
        System.out.println();

    }
}
