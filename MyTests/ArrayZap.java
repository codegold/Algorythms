package MyTests;

import java.util.Arrays;

public class ArrayZap {
    public static void main(String[] args) {
        int[] num = new int[10];
        int i;
        int search = 33;

        for (i = 0; i < num.length; i++)
            num[i] = i;

        System.out.println(Arrays.toString(num));

        //find search in num
        for (i = 0; i < num.length; i++)
            if (num[i] == search)
                break;

        if (i == num.length - 1)
            System.out.println("Founded " + search);
        else
            System.out.println("No such.");


        //System.out.println("No such.");

    }
}
