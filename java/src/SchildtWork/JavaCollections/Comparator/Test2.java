package JavaCollections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<People> listPeople = new ArrayList<>();
        listPeople.add(new People(1, "Christopher"));
        listPeople.add(new People(4, "Carmine"));
        listPeople.add(new People(2, "Tony"));
        listPeople.add(new People(3, "Ade"));

        Collections.sort(listPeople, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(listPeople);
    }

}

class People {
    private int id;
    private String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    public int getId() {
        return id;
    }
}