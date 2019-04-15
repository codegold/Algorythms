package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.println(
                    "Enter string containing delimiters: ");
            System.out.flush();
            input = getString();   //Reading string from keyboard
            if (input.equals(""))  //Finish if [ENTER]
                break;
                                   //Creation object BracketChecker
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();    //Checking pair brackets
        }
    }
    //-------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
