package src.SchildtWork.Part10Tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hyphen {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Сначала проверить, указаны ли имена обоих файлов
        if (args.length != 2) {
            System.out.println("Use: Hyphen from where");
            return;
        }

        // Скопировать файл и заменить в нем пробелы дефисами
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                // преобразовать пробел в дефис
                if ((char) i == ' ') i = '-';

                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error of in out data: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Error while closing file.");
            }
            try {
                if (fin != null) fout.close();
            } catch (IOException e) {
                System.out.println("Error while closing exit file.");
            }
        }

    }
}
