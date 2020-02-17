package src.SchildtWork.Part10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Help {
    String helpfile; //name of file

    Help(String fname) {
        helpfile = fname;
    }

    // Отобразить справочную информацию по указанной теме
    boolean helpon(String what) {
        int ch;
        String topic, info;

        // Открыть справочный файл

        try (
                BufferedReader br =
                        new BufferedReader(new FileReader(helpfile))) {
            do {
                // Читать символы до тех пор, пока не встретится символ #
                ch = br.read();
                // Проверить, совпадают ли темы
                if (ch == '#') {
                    topic = br.readLine();
                    if (what.compareTo(topic) == 0) { // find topic
                        do {
                            info = br.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) &&
                                (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException e) {
            System.out.println("Error while reaching file.");
            return false;
        }
        return false;
    }
}
