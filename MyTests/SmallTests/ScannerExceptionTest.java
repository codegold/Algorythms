package SmallTests;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExceptionTest {
    public static void main(String[] args) throws ScannerExceptionTrace {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter smth!");
            int x = Integer.parseInt(sc.nextLine());

            if (x != 0) {
                System.out.println("You entered smth wrong!");
                throw new ScannerExceptionTrace("It's my warning message!");

            }
        }

    }
}
