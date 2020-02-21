package src.SchildtWork.Part11Concurrency.Suspend;

// Приостановка, возобновление и остановка потока

public class MyThread implements Runnable {
    Thread thrd;

    volatile boolean suspended; //pause thrd while true
    volatile boolean stopped; //stop thrd while true

    MyThread(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " start");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thrd.getName() + " exit");
    }

    //Stop the thread
    synchronized void mystop() {
        stopped = true;

        // Следующие операторы обеспечивают полную
        // остановку приостановленного потока
        suspended = false;
        notify();
    }

    //resume the thread
    synchronized void myresume() {
        suspended = false;
        notify();
    }

    //pause the thread
    synchronized void mysuspend() {
        suspended = false;
    }
}

//continue thread
class Suspend {
    public static void main(String[] args) {
        MyThread ob1 = new MyThread("My thread");

        try {
            Thread.sleep(1000);//allow thread start ob1

            ob1.mysuspend();
            System.out.println("Pause thread");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Continue thread");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Pause thread");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Continue thread");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("STOP");
            ob1.mystop();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        //wait of finish thread
        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exit from the main thread");
    }
}
