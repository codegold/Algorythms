package src.SchildtWork.Part10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        // Создать объект типа BufferedReader,
        // использующий поток ввода System.in

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.println("How much numbers?");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("unknown format");
            n = 0;
        }
        System.out.println("Input " + n + " values.");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();

            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException e){
                System.out.println("Wrong format.");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average num is: " + avg);

    }
}
