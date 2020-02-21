package src.SchildtWork.Part11Concurrency.UseMain;

//handle main thread
public class UseMain {
    public static void main(String[] args) {

        Thread thrd;

        //get main thread
        thrd = Thread.currentThread();

        System.out.println(thrd.getName() + " - its main thrd name");
        System.out.println(thrd.getPriority() + " - its his priority");
        System.out.println("Set name and priority.");

        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("New name of the thread: " + thrd.getName());
        System.out.println("New priority of the thread: " + thrd.getPriority());
    }
}
