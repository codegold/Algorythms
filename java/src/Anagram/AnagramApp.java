package src.Anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a word: ");
        String input = getString();
        size = input.length();
        count = 0;
        for (int j = 0; j < size; j++)
            arrChar[j] = input.charAt(j);
        doAnagram(size);
    }

    public static void doAnagram(int newSize) {
        if (newSize == 1)
            return;
        for (int j = 0; j < newSize; j++) {
            doAnagram(newSize - 1);
            if (newSize == 2)
                displayWord();
            rotate(newSize);
        }
    }


    private static void displayWord() {
    }

    private static void rotate(int newSize) {
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
