package src.Anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a word: "); //get a word
        String input = getString();
        size = input.length(); //define size
        count = 0;
        for (int j = 0; j < size; j++) //save to array
            arrChar[j] = input.charAt(j);
        doAnagram(size); //create anagram
    }

    public static void doAnagram(int newSize) {
        if (newSize == 1) //if word to small
            return; //stop
        for (int j = 0; j < newSize; j++) { //for each position
            doAnagram(newSize - 1); //create anagram left letters
            if (newSize == 2) //if inside condition
                displayWord();
            rotate(newSize); //cycle move of all word
        }
    }

    // rotate left all chars from position to end
    private static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = arrChar[position]; //save first letter
        for (j = position + 1; j < size; j++) //move all letters to the left
            arrChar[j - 1] = arrChar[j]; //move first letter to the right
        arrChar[j - 1] = temp;
    }

    private static void displayWord() {
        if (count < 99)
            System.out.print(" ");
        if (count < 9)
            System.out.print(" ");
        System.out.print(++count + " ");
        for (int j = 0; j < size; j++)
            System.out.print(arrChar[j]);
        System.out.print(" ");
        System.out.flush();
        if (count % 6 == 0)
            System.out.println("");
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
