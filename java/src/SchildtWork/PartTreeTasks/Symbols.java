package src.SchildtWork.PartTreeTasks;

import java.io.IOException;

public class Symbols {
    public static void main(String[] args) throws IOException {

        char ch;
        int spaces = 0;

        System.out.println("Press . to stop.");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') {spaces++;
            System.out.println("You pressed space.");}
        } while (ch!= '.');
        System.out.println("Spaces number is: "+ spaces);
    }
}
