package src.Brackets;

public class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        input = in;
    }

    public void check() {
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);

        for (int j = 0; j < stackSize; j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stackX.push(ch);
                    break;

                case '}':
                case ')':
                case ']':
                    if (!stackX.isEmpty()) {
                        char chx = stackX.pop();
                        if ((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != ']') ||
                                (ch == ')' && chx != '('))
                            System.out.println("Error: + " + ch + " at " + j);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!stackX.isEmpty())
            System.out.println("Error: missing right delimiter");
    }
}

