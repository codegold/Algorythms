package src.AlgoDraw;

public class Algo {
    public static void main(String[] args) {
        char a = '*';
        char b = ' ';
        //int i;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a);
            }
            System.out.println(a);
        }

    }
}