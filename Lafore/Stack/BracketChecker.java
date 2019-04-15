package Stack;

public class BracketChecker {
    private String input;                            //Input string

    //-------------------------------------------------------------
    public BracketChecker(String in)
    {                                                 //Constructor
        input = in;
    }
    //-------------------------------------------------------------

    public void check() {
        int stackSize = input.length();      //Determine stack size
        StackChar theStack = new StackChar(stackSize);//Create stack

        for (int j = 0; j < input.length(); j++) {    //Reading all
            char ch = input.charAt(j);             //Reading symbol
            switch (ch) {
                case '{':                        //Opening brackets
                case '[':
                case '(':
                    theStack.push(ch);               //Put in stack
                    break;

                case '}':                        //Closing brackets
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {//If stack is not emp
                        char chx = theStack.pop();//Take out & check
                        if ((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '('))
                            System.out.println("Error: " + ch + " at " + j);
                    } else                     //Premature shortage
                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default:
                    break;
            }
        }//At this point all symbols processed
        if (!theStack.isEmpty())
            System.out.println("Error: missing right delimiter!");
    }
}
