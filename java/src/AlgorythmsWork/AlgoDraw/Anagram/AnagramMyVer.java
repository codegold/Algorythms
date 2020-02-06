package src.AlgorythmsWork.AlgoDraw.Anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AnagramMyVer {
    static int size;
    static int count;
    static char[] myChar = new char[100];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = getString();
        size = input.length();
        count = 0;
        for (int i = 0; i < size; i++) {
            myChar[i] = input.charAt(i);
        }
        doAnagram(size);
    }

    public static void doAnagram(int newSize) {
        if (newSize == 1) return;
        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize - 1);
            if (newSize == 2) displayWord();
            rotate(newSize);
        }
    }

    public static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = myChar[position];
        for (j=position+ 1; j < size; j++)
            myChar[j-1] = myChar[j];
        myChar[j-1] = temp;
    }

    private static void displayWord() {
//        if (count < 9)
//            System.out.print(" ");
        if (count < 99)
            System.out.print(" ");
        System.out.print(++count + " ");
        for (int i = 0; i < size; i++)
            System.out.print(myChar[i]);
        System.out.print("   ");
        System.out.flush();
        if (count % 6 == 0)
            System.out.println("");
    }

    public static String getString() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String s = br.readLine();
        return s;
    }
}
