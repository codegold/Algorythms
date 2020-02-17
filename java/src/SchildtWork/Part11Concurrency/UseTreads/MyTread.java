package src.SchildtWork.Part11Concurrency.UseTreads;

class MyTread implements Runnable {
    String thrdName;

    MyTread(String name){
        thrdName = name;
    }

    //Point of entrance to thread
    public void run() {
        System.out.println(thrdName + " - start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B "+ thrdName +
                        " counter: " + count);
            }
        }
        catch (InterruptedException ie){
            System.out.println(thrdName + " - interrupted");
        }
        System.out.println(thrdName + " finishing.");
    }
}
