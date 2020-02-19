package src.SchildtWork.Part11Concurrency.SumArray;

public class SumArray {
    private int sum;

    int sumArray(int nums[]) {
        sum = 0; //null the sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Current value of sum for "
                    + Thread.currentThread().getName() +
                    ": " + sum);

            try {
                Thread.sleep(10); //allow switch gear
            } catch (InterruptedException e) {
                System.out.println("Cancelling main thread.");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    //create new thread
    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    @Override
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " start");

        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("SUM for " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + " - finish");
    }
}

class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        MyThread mt1 = new MyThread("Child #1", a);
        MyThread mt2 = new MyThread("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Finish of main");
        }
    }
}
