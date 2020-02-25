package src.SchildtWork.Part11Concurrency.Alishev.Syncronized;

public class Test {
    private int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.doWork();

    }

    public void doWork() throws InterruptedException {
        Thread thrd1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        Thread thrd2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        thrd1.start();
        thrd2.start();

        thrd1.join();
        thrd2.join();

        System.out.println(counter);
    }

    public synchronized void increment() {
        counter++;
    }
}



