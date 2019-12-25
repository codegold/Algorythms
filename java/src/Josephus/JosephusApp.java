package src.Josephus;

public class JosephusApp {
    public static void main(String[] args) throws NullPointerException {

        Josephus trial = new Josephus(10,2,5);

        trial.execute();
    }
}
