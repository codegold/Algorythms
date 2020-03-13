package JavaCollections.HashCodeEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Map<Person, String> map = new HashMap<>();

        Person person1 = new Person(1, "Tony");
        Person person2 = new Person(1, "Tony");

        set.add(person1);
        set.add(person2);

        map.put(person1, "One");
        map.put(person2, "Two");

        System.out.println(set);
        System.out.println(map);

    }
}

class Person {
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
}