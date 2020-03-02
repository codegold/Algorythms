package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.Semaphore.MyPhilosopher;

import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i < 6; i++)
            new Philosopher(semaphore, i).start();
    }

}

class Philosopher extends Thread {
    Semaphore semaphore;
    int id;
    int num = 0;

    public Philosopher(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (num < 3){
                semaphore.acquire();
                System.out.println ("Философ " + id+" садится за стол");
                sleep(444);
                num++;

                System.out.println ("Философ " + id+" выходит из-за стола");
                semaphore.release();

                sleep(444);


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
