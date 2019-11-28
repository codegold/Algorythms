package src.infix;

public class InToPost {// Преобразование инфиксной записи в постфиксную
    private StackX theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }

    public String doTrans() // Преобразование в постфиксную форму
    {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.displayStack("For " + ch + " ");//diagnostics
            switch (ch) {
                case '+':   // + or -
                case '-':
                    gotOper(ch, 1); // extract priority (1)
                    break;
                case '*': //  * or /
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':             // open brace
                    theStack.push(ch); //put to stack
                    break;
                case ')':     // closing brace
                    gotParen(ch);
                    break;
                default:     // operand remains
                    output = output + ch;
                    break; // write to output
            }
        }
        while (!theStack.isEmpty()){
            theStack.displayStack("While "); //diagnostics
            output = output + theStack.pop();  // write to output
        }
        theStack.displayStack("End   ");
        return output;
    }

    private void gotParen(char ch) {
    }

    public void gotOper(char opThis, int prec1) {

    }
}
