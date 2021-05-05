package Exceptions;

public class MultyCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chrs[] = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0)
                    //create Arithmetic
                    result = a / b;
                else
                    //create index out
                    chrs[5] = 'X';
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception is:: " + e);
            }
        }
        System.out.println("After multy catch");
    }
}
