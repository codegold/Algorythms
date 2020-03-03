package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.ThreadAbortion;

import java.util.Random;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 50_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread was interrupted.");
                        break;
                    }

                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Starting thread.");

        thread1.start();
        thread1.sleep(1000);

        thread1.interrupt();

        thread1.join();

        System.out.println("Finishing thread.");
    }
}
