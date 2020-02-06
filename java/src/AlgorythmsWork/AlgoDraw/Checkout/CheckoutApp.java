package src.AlgorythmsWork.AlgoDraw.Checkout;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckoutApp {
    public static void main(String[] args) throws NullPointerException, IOException {
        String input;
        Checkout grocery = new Checkout(2, 3, true);
        grocery.initialize();
        grocery.display();

        while (true) {
            System.out.print("Time to Pass: ");
            System.out.flush();
            input = getString();

            if (input.equals("")) break;
            grocery.process(Integer.parseInt(input));

            grocery.display();
        }
    }

    public static String getString() throws NullPointerException, IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
