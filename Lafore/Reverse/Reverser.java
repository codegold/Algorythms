package Reverse;

import Reverse.StackX;

class Reverser {
    private String input;
    private String output;

//----------------------------------------------------------------

    public Reverser(String in) {                     //Constructor
        input = in;
    }

//----------------------------------------------------------------

    public String doRev() {                          //Permutation
        int stackSize = input.length();                //Size init
        Reverse.StackX theStack = new StackX(stackSize);    //Stack create

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);//Reading symbols from input
            theStack.push(ch);                    //Input in stack
        }

        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();            //Take from stack
            output = output + ch;               //Adding to output
        }
        return output;
    }
}
//////////////////////////////////////////////////////////////////




