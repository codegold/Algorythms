package src.Towers;

public class MyHanoi {
    static int nDisks = 3;

    public static void main(String[] args) {
        myHannoi(nDisks, 'A', 'B', 'C');
    }

    public static void myHanoi(int nDis, char a, char b, char c) {
        myHannoi(nDisks, 'A', 'B', 'C');
    }

    public static void myHannoi(int nDis, char a, char b, char c) {
        if (nDis == 1) {
            System.out.println("Disk 1 moves from: " + a + " to: "
                    + c);
        } else {
            myHannoi(nDis - 1, a, c, b);
            System.out.println("Disk: " + nDis + " move from: " + a +
                    " to: " + c);
            myHannoi(nDis - 1, b, a, c);
        }
    }
}
