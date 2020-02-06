package src.AlgorythmsWork.AlgoDraw.Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramLite {

    static boolean isAnagram(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        if(aLength != bLength) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        return Arrays.equals(aChars, bChars);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
