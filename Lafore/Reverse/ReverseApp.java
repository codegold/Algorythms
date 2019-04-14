package Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();               //Reading from keyboard
            if (input.equals(""))                    //Finish if ENTER
                break;

            Reverser theReverser = new Reverser(input);//Create obj Reverser
            output = theReverser.doRev();                      //Using
            System.out.println("Reversed: " + output);
        }
    }
    //----------------------------------------------------------------

    public static  String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
