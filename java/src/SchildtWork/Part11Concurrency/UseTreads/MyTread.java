package src.SchildtWork.Part11Concurrency.UseTreads;

class MyTread implements Runnable {
    Thread thrd;

    MyTread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(600);
                System.out.println("B " + thrd.getName()
                        + ", counter: " + count);
            }
        }
        catch (InterruptedException ie) {
            System.out.println(thrd.getName() + " canceled");
        }
        System.out.println("Finishing of main thread.");
    }
}

class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Start of the main thread.");

        MyTread mt = new MyTread("Child #1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(150);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("Interrupting main thread.");
            }
        }
        System.out.println("Finishing of the main thread.");
    }
}
