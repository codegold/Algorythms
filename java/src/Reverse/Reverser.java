package src.Reverse;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String in) {
        input = in;
    }

    public String doReverse() {
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);

        for (int i = 0; i < stackSize; i++) {
            char ch = input.charAt(i);
            stackX.push(ch);
        }
        output = "";
        while (!stackX.isEmpty()){
            char ch = stackX.pop();
            output += ch;
        }
        return output;
    }
}
