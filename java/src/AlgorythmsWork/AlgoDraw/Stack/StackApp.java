package src.AlgorythmsWork.AlgoDraw.Stack;

public class StackApp {
    public static void main(String[] args) {

        StackX stackX = new StackX(10);
        stackX.push(20);
        stackX.push(40);
        stackX.push(60);
        stackX.push(80);
        stackX.push(100);
        System.out.println(stackX.peek());

        while (!stackX.isEmpty()) {
            long value = stackX.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();

//        while (!stackX.isFull()) {
//            int newValue = (int) (Math.random()*100);
//            stackX.push(newValue);
//            System.out.print(newValue);
//            System.out.print(" ");
//        }
//        System.out.println();
        stackX.push(33);
        stackX.push(34);
        System.out.println(stackX.peek());


    }
}
