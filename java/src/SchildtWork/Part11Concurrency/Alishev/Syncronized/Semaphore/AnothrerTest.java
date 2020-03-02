package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.Semaphore;

import java.util.concurrent.Semaphore;

public class AnothrerTest {
    public static void main(String[] args) {
        Semaphore sema = new Semaphore(1);
        CommonResource comres = new CommonResource();
        new Thread(new CountThread(comres, sema, "CountThread 1")).start();
        new Thread(new CountThread(comres, sema, "CountThread 2")).start();
        new Thread(new CountThread(comres, sema, "CountThread 3")).start();
    }
}

class CommonResource {
    int x = 1;
}

class CountThread implements Runnable {
    CommonResource comres;
    Semaphore sema;
    String name;

    public CountThread(CommonResource comres, Semaphore sema, String name) {
        this.comres = comres;
        this.sema = sema;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " Wait for permission.");
            sema.acquire();
            comres.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + ": " + comres.x);
                comres.x++;
                Thread.sleep(350);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " frees permission.");
        sema.release();
    }
}
