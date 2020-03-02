package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.Semaphore;

import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);

        semaphore.acquire();
        semaphore.acquire();
        semaphore.acquire();

        System.out.println("All three acquired.");
        semaphore.acquire();

        System.out.println("No reach here");

        semaphore.release();

        System.out.println(semaphore.availablePermits());
    }
}


