package src.SchildtWork.Part10Tasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hyphen2 {
    public static void main(String[] args) throws IOException {
        int i;
        // Сначала проверить, указаны ли имена обоих файлов
        if (args.length != 2) {
            System.out.println("Using: CopyFile from? where ");
            return;
        }
        // Скопировать файл и заменить в нем пробелы дефисами,
        // используя оператор try с ресурсами
        try (FileReader fin = new FileReader(args[0]);
             FileWriter fout = new FileWriter(args[1])) {
            do {
                i = fin.read();
                // преобразовать пробел в дефис
                if ((char) i == ' ') i = '-';

                if(i != -1) fout.write(i);
            } while (i != -1);
        }catch (IOException e) {
            System.out.println("Error in-out: " + e);
        }
    }
}
