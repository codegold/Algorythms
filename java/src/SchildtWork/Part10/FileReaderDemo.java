package src.SchildtWork.Part10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String s;
        // Создать и использовать объект FileReader, помещенный
        // в оболочку на основе класса BufferedReader
        try
                (BufferedReader br =
                         new BufferedReader
                                 (new FileReader("testFw2.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("IN OUT error " + e);
        }
    }
}
