package src.Postfix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        while (true) {
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) //finish if button pressed
                break; //[ENTER]

            // Создание объекта для разбора выражения
            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Evaluate to " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
