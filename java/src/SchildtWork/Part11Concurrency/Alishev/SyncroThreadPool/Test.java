package src.SchildtWork.Part11Concurrency.Alishev.SyncroThreadPool;

import org.omg.CORBA.TIMEOUT;
import sun.tools.jconsole.Worker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            es.submit(new Work(i));
        }
        es.shutdown();
        System.out.println("All tasks submitted.");


       es.awaitTermination(1, TimeUnit.DAYS);


    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work " + id + " was completed.");
    }
}
