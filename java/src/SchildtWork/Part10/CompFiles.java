package src.SchildtWork.Part10;

import java.io.*;

public class CompFiles {
    public static void main(String[] args) {
        int j = 0, i = 0;
        // Прежде всего необходимо убедиться в том, что программе
        // передаются имена обоих файлов.

        if (args.length != 2) {
            System.out.println("Using: Compfiles file1 file 2");
            return;
        }

        //Compare files
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            //check every file
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);
            if (i != j)
                System.out.println("Files are diff.");
            else
                System.out.println("Files are similar");
        } catch (IOException e) {
            System.out.println("Error in out: " + e);
        }
    }
}
