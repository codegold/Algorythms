package src.SchildtWork.Part11Concurrency.Priority;

public class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    /* Создание нового потока. Обратите внимание на то,
    что конструктор не запускает поток на выполнение. */

    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    // Начать выполнение нового потока
    @Override
    public void run() {
        System.out.println(thrd.getName() + " start");
        do {
            count++;

            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("B " + currentName);
            }
        }
        while (stop == false && count < 10000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " finish");
    }
}

class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High priority");
        Priority mt2 = new Priority("Low priority");

        //Set priorities
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        //Start threads
        mt1.thrd.start();
        mt2.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Cancel main thread");
        }
        System.out.println("\n Counter of thread HIGH Priority: "
                + mt1.count);
        System.out.println("\n Counter of thread LOW Priority: "
                + mt2.count);
    }
}