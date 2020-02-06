package src.AlgorythmsWork.AlgoDraw.Postfix;

public class ParsePost {
    private StackX stackX;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        stackX = new StackX(20);
        char ch;
        int j;
        int num1, num2, interAns;

        for (int i = 0; i < input.length(); i++) { //for each symbol
            ch = input.charAt(i);                  //read symbol
            stackX.displayStack("" + ch + " "); //diagnostic
            if (ch >= '0' && ch <= '9')             //if its digit
                stackX.push((int) (ch - '0'));      //put in stack
            else {                         //if its operator
                num2 = stackX.pop();       // extract operator
                num1 = stackX.pop();
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                stackX.push(interAns); // current result put in stack
            }
        }
        interAns = stackX.pop(); // get a result
        return interAns;
    }
}
