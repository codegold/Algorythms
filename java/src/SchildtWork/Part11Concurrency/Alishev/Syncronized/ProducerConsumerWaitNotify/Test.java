package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.ProducerConsumerWaitNotify;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {

    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producing...");
            this.wait();
            Thread.sleep(1000);
            System.out.println("after wait");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner sc = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return (enter)");
            sc.nextLine();
            Thread.sleep(1000);
            System.out.println("Producing continue.");
            this.notify();
            Thread.sleep(3000);

            System.out.println("After notify");

        }
    }
}

//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        WaitAndNotify wn = new WaitAndNotify();
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    wn.produce();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    wn.consume();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//    }
//}
//
//class WaitAndNotify {
//    public void produce() throws InterruptedException {
//        synchronized (this) {
//            System.out.println("Producer thread  started...");
//            wait();
//            System.out.println("Producer thread  resumed...");
//
//        }
//    }
//
//    public void consume() throws InterruptedException {
//        Thread.sleep(2000);
//        Scanner sc = new Scanner(System.in);
//
//        synchronized (this) {
//            System.out.println("Waiting for return key.");
//            sc.nextLine();
//            notify();
//        }
//
//    }
//}
