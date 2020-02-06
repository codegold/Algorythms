package src.AlgorythmsWork.AlgoDraw;

public class Algo {
    public static void main(String[] args) {
        char a = '*';
        char b = '_';
        int lineLength = 6;
        for (int i = 0; i < lineLength; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a);
            }
            System.out.println(a);
        }

        System.out.println();
        int i;

        System.out.println();
//        for (i = 0; i < lineLength; i++) {
//            for (int j = lineLength-1; j > i; j--) {
//                System.out.print(a);
//            }
//            System.out.println(a);
//        }

        for (i = 0; i < lineLength; i++) {
            for (int j = i + 1; j < lineLength; j++) {
                System.out.print(b);
            }
            System.out.println(a);
        }
    }

}