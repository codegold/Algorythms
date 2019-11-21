package src.Stack;

public class StackApp {
    public static void main(String[] args) {

        StackX stackX = new StackX(10);
        stackX.push(20);
        stackX.push(40);
        stackX.push(60);
        stackX.push(80);
        stackX.push(100);

        while (!stackX.isEmpty()) {
            long value = stackX.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();

        while (!stackX.isFull()) {
            int newValue = (int) (Math.random()*100);
            stackX.push(newValue);
            System.out.print(newValue);
            System.out.print(" ");
        }
        System.out.println();


    }
}
