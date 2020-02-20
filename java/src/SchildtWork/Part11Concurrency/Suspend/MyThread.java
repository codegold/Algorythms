package src.SchildtWork.Part11Concurrency.Suspend;

public class MyThread implements Runnable {
    volatile boolean suspended;
    volatile boolean stopped;

    public MyThread(boolean suspended, boolean stopped) {
        this.suspended = suspended;
        this.stopped = stopped;
    }

    @Override
    public void run() {

    }
}
