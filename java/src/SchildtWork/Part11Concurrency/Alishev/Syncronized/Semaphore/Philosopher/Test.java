package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.Semaphore.Philosopher;

import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        for (int i = 1; i < 6; i++)
            new Philosopher(sem, i).start();

    }
}

class Philosopher extends Thread {
    Semaphore sem;// семафор. ограничивающий число философов
    // кол-во приемов пищи

    int num = 0; // условный номер философа
    int id;

    public Philosopher(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (num < 3) {
                sem.acquire();
                System.out.println("Философ " + id+" садится за стол");
                sleep(555);
                num++;

                System.out.println("Философ " + id+" выходит из-за стола");
                sem.release();

                sleep(555);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}
