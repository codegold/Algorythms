package src.SchildtWork.Part10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterDemo {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.println("Press stop to stop.");

        try (FileWriter fw = new FileWriter("testFw2.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("In out error " + e);
        }
    }
}
