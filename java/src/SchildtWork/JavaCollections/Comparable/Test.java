package JavaCollections.Comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    public static void addElements(Collection collection) {
        collection.add(new Person(1, "John"));
        collection.add(new Person(3, "Bob"));
        collection.add(new Person(4, "Chrissy"));
        collection.add(new Person(2, "Tony"));
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
        //return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.getName().length()) {
            return -1;
        } else if (this.name.length() < o.getName().length()) {
            return 1;
        } else return 0;
    }
}