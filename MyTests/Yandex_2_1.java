package MyTests;

import java.util.Scanner;

class yandex_2_1 {
    public static String compressBad(String str) {
        String mystr = "";
        char last = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) { // Находим повторяющийся символ
                count++;
            } else {	// Вставляем счетчик символа и обновляем последний символ
                mystr += last + count;
                last = str.charAt(i);
                count = 1;
            }
        }
        return mystr + last + count;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        System.out.println(compressBad(str));

    }
}
