package src.infix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString(); //reading from input
            if (input.equals("")) //if ENTER pressed
                break;

            InToPost theTrans = new InToPost(input);
            output = theTrans.doTrans();
            System.out.println("Postfix is " + output + '\n');
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bsr = new BufferedReader(isr);
        String s = bsr.readLine();
        return s;
    }
}
