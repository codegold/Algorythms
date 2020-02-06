package src.AlgorythmsWork.AlgoDraw.Reverse;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String in) {
        input = in;
    }

    public String doReverse() {
        int stackSize = input.length(); //Define stack size
        StackX stackX = new StackX(stackSize); // Create stack

        for (int i = 0; i < stackSize; i++) { //reverse
            char ch = input.charAt(i);
            stackX.push(ch);
        }
        output = "";
        while (!stackX.isEmpty()) {
            char ch = stackX.pop(); //Reading from stack
            output += ch; //Input in stack
        }
        return output;
    }

    public String reverse() {
        int size = input.length();
        StackX stackX = new StackX(size);

        for (int i = 0; i < size; i++) {
            stackX.push(input.charAt(i));
        }

        output = "";
        char ch = stackX.pop();
        while (!stackX.isEmpty()) {
            output += ch;
        }
        return output;
    }

}
