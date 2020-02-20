package src.SchildtWork.Part11Concurrency.TickTock;

// Использование методов wait() и notify() для имитации часов

public class TickTock {
    String state; //// содержит сведения о состоянии часов

    synchronized void tick(boolean running) {
        if (!running) { //stop the watch
            state = "ticked";
            notify(); //уведомить ожидающие потоки
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // установить текущее состояние
        // после такта "тик"

        notify(); //allow tock method; send notification to tock()
        try {
            while (!state.equals("tocked"))
                wait(); //wait untill tock not finished
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { //stop the watch
            state = "tocked";
            notify(); //notify threads
            return;
        }
        System.out.println("Tock");

        state = "tocked";// установить текущее состояние
        // после такта "так"

        notify(); //allow tick() send notification to tick()

        try {
            while (!state.equals("ticked"))
                wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++)
                ttOb.tick(true);
            ttOb.tick(false);
        }

        else {
            for (int i = 0; i < 5; i++)
                ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread mt1 = new MyThread("Tick", tt);
        MyThread mt2 = new MyThread("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
