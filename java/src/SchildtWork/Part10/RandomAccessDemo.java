package src.SchildtWork.Part10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;


//        Отдельное замечание следует сделать относительно позиций расположения
//        значений в файле. Поскольку для хранения значения типа douЫe требуется
//        8 байтов, каждое по­ следующее значение начинается на 8-байтовой границе
//        предьшущего значения. Иными словами, первое числовое значение начинается
//        с нулевого байта, второе - с 8-ro байта, третье - с 16-ro байта и т.д.
//                Поэтому для чтения четвертого значения указатель файла должен
//        быть установлен при вызове метода seek () на позиции 24-ro байта.

        // Открыть и использовать файл с произвольным
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            //write to file
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }
            //read some data from file
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("First data: " + d);

            raf.seek(8);//find second data double type
            d = raf.readDouble();
            System.out.println("Second data: " + d);

            raf.seek(8 * 3); //find forth data type double
            d = raf.readDouble();
            System.out.println("Forth data: " + d);
            System.out.println();

            //Read data over 1
            System.out.println("Reading with odd nums: ");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8 * i);//Find i data type double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException e) {
            System.out.println("In out error: "+ e);
        }

    }
}
