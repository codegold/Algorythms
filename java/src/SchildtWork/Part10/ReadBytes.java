package src.SchildtWork.Part10;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args)  throws IOException {
        byte data[] = new byte[100];
        System.out.println("Enter something: ");
        System.in.read(data);
        System.out.print("U entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}
