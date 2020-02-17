package src.SchildtWork.Part10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Pick a topic: ");
        try {
            topic = br.readLine();
        } catch (IOException e) {
            System.out.println("Error while reading from console.");
        }
        return topic;
    }

    //DEMO
}

class FileHelp {
    public static void main(String[] args) {
            Help helpObj = new Help("helpfile.txt");
            String topic;
        System.out.println("Use system. /n " + "For exit press 'stop'.");
        do {
            topic = helpObj.getSelection();

            if(!helpObj.helpon(topic))
                System.out.println("Topic not found. \n");
        }while (topic.compareTo("stop") != 0);
    }
}

