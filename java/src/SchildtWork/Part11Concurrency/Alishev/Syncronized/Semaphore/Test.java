package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Connection connection = Connection.getConnection();

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);


        //Semaphore semaphore = new Semaphore(3);
//        semaphore.acquire();
//        semaphore.acquire();
//        semaphore.acquire();
//
//        System.out.println("All three acquired.");
//        semaphore.acquire();
//
//        System.out.println("No reach here");
//
//        semaphore.release();
//
//        System.out.println(semaphore.availablePermits());
    }
}

class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {

    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        Thread.sleep(3000);
        synchronized (this) {
            connectionsCount--;
        }
    }
}


