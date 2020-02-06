package src.SchildtWork.PartTreeTasks;

import java.io.IOException;

public class CaseChange {

    public static void main(String[] args) throws IOException {

        char ch;
        int changes = 0;

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }

        }
        while (ch != '.');
        System.out.println("Changes times: " + changes);
    }
}
