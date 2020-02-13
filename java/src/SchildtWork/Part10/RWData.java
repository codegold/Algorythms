package src.SchildtWork.Part10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        //save row of data
        try (DataOutputStream dataOut =
                     new DataOutputStream(new FileOutputStream("TestData"))) {
            System.out.println("Saved: " + i);
            dataOut.writeInt(i);

            System.out.println("Saved: " + d);
            dataOut.writeDouble(d);

            System.out.println("Saved: " + b);
            dataOut.writeBoolean(b);

            System.out.println("Saved: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        }
        catch (IOException e) {
            System.out.println("Error while saving.");
            return;
        }
        System.out.println();

        //Read saved data now

        try (DataInputStream dataIn =
                     new DataInputStream(new FileInputStream("TestData"))) {
            i = dataIn.readInt();
            System.out.println("Read: " + i);

            d = dataIn.readDouble();
            System.out.println("Read: " + d);

            b = dataIn.readBoolean();
            System.out.println("Read: " + b);

            d = dataIn.readDouble();
            System.out.println("Read: " + d);
        }
        catch (IOException e) {
            System.out.println("Error while reading.");
        }
    }
}
