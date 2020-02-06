package src.AlgorythmsWork.AlgoDraw.Towers;

// Решение головоломки "Ханойская башня"
public class TowersApp {
    static int nDisks = 3;

    public static void main(String[] args) {
        doTowers(nDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int topN, char from, char tmp, char to) {

        if (topN == 1)
            System.out.println("Disk 1 from " + from + " to " + to);

        else {
            doTowers(topN - 1, from, to, tmp);
            System.out.println("Disk " + topN +
                    " from " + from + " to " + to);

            doTowers(topN-1, tmp, from, to);

        }
    }
}
