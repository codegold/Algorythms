package src.SchildtWork.Part10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String[] args) throws IOException{
        String c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter anythnig. Input stop to stop");

        do {
            c =  br.readLine();
            System.out.println(c);
        } while (!c.equals("stop"));
        System.out.println("You pressed stop to finish");
    }
}
