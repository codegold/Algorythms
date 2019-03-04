package Linear;

public class Simple {
    public static void main(String[] args) {
        //char ch = '*';
        drawTraiangle();
    }

    public static void drawTraiangle() {
        int count = 7;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.println("*");

            }
        }
    }
}
