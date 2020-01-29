package src.Towers;

public class MyHanoi {
    static int nDisks = 3;

    public static void main(String[] args) {
        myHanoi(nDisks, 'A', 'B', 'C');
    }

    public static void myHanoi(int nD, char from, char tmp, char to) {
        if (nD == 1)
            System.out.println("Disk 1 from: " + from + " to: " + to);

        else {
            myHanoi(nD - 1, from, to, tmp);
            System.out.println("disk " + nD + " from: " +from+ " to: " +to);

            //myHanoi(nD-1, tmp, from, to);
        }
    }
}
