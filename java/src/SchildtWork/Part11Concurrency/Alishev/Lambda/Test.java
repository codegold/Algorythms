package src.SchildtWork.Part11Concurrency.Alishev.Lambda;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 11);
        System.out.println(a);
    }
}


public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run((x, y) -> 0);

        int z = 3;

        runner.run((x, y) -> x + y + z);
    }
}
