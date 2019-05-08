package MyLamp;

public class CounterTest {
    public static void main(String[] args) {
        counter(1);
    }
    public static void counter(int i) {
        if (i==9)
            return;

        System.out.println(i + " Mississippi");

        counter(i+1);


    }
}
