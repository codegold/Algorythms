package src.AlgorythmsWork.AlgoDraw.Anagram;

import java.io.IOException;

public class AnagramLiteTwo {

    public static boolean isAnagram(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        if (aLength != bLength) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] charFrequencies = new int[26];

        for (int i = 0; i < aLength; i++) {
            char currChar = a.charAt(i);
            int index = currChar - 'a';
            charFrequencies[index]++;
        }
        for (int i = 0; i < bLength; i++) {
            char currChar = b.charAt(i);
            int index = currChar - 'a';
            charFrequencies[index]--;
        }

        for (int i = 0; i < 26; i++) {
            if(charFrequencies[i] != 0) return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        isAnagram("Mama", "Mapa");
    }
}
