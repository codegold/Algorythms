package src.SchildtWork.Part11Concurrency.ExtendedThread;

class MyThread extends Thread {

    MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + getName() +
                        ", counter " + count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(getName() + " cancelled");
        }

        System.out.println(getName() + " closing");
    }
}


class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Start of the main thread.");
        MyThread mt = new MyThread("Child #1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finish main thread.");
    }
}
