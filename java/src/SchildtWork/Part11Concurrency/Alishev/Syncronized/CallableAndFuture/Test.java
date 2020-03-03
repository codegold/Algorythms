package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.CallableAndFuture;

import java.util.Random;
import java.util.concurrent.*;

public class Test {
    private static int result;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("start");
            try {
                Thread.sleep(555);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finish");

            Random random = new Random();
            int randomValue = random.nextInt();

            if (randomValue < 5)
                throw new Exception("Something bad happened.");

            return random.nextInt(10);
        });

        executorService.shutdown();

        try {
            int result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}


