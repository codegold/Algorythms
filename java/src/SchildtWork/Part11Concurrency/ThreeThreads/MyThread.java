package src.SchildtWork.Part11Concurrency.ThreeThreads;

public class MyThread implements Runnable {
    Thread thrd;

    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName()
                        + ", count " + count);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thrd.getName() + " END.");
    }
}

class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Start of the main thread.");

        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");

        try {
            mt1.thrd.join();
            System.out.println("Child#1 - connected.");
            mt2.thrd.join();
            System.out.println("Child#2 - connected.");
            mt3.thrd.join();
            System.out.println("Child#3 - connected.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finishing of the main.");
    }
}
