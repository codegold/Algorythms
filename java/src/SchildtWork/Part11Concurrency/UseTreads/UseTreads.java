package src.SchildtWork.Part11Concurrency.UseTreads;

public class UseTreads {
    public static void main(String[] args) {
        System.out.println("Start of main thread");

        // Сначала создать объект типа MyThread.
        MyTread mt = new MyTread("Child #1");

        // Затем сформировать поток на основе этого объекта.
        Thread newThrd = new Thread(mt);
        
        newThrd.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {
                System.out.println("Cancel of main thread");
            }
        }
        System.out.println("Finishing if main thread.");
    }
}
