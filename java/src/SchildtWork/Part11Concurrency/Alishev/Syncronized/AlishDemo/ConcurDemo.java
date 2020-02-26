package src.SchildtWork.Part11Concurrency.Alishev.Syncronized.AlishDemo;

import java.util.Scanner;

public class ConcurDemo {
    public static void main(String[] args) {
        MyThreadd mt = new MyThreadd();
        mt.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        mt.shutDown();

    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello from Runner");
        }
    }
}

class MyThreadd extends Thread {
    private boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello from MyThreadd");
            try {
                MyThreadd.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void shutDown() {
        this.running = false;
    }
}
