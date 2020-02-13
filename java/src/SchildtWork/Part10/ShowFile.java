package src.SchildtWork.Part10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Using : ShoqwFile name_file");
            return;
        }

        try {
            fin = new FileInputStream(args[0]); //open file

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException ecx) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Error in out.");
            //For closing use FINALLY

        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error while closingggg.");
            }
        }
    }
}
