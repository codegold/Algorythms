package SmallTests;

public class Human {
    private String name;
    private int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return  name+ " " + age;
    }

    public static void main(String[] args) {
        Human h1 = new Human("Bob", 44);
        System.out.println(h1);
    }
}
