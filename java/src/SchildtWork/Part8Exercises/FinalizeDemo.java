package src.SchildtWork.Part8Exercises;

public class FinalizeDemo {
    int x;

    FinalizeDemo(int i){
        x = i;
    }

    //Call when deleting
    protected void finalize() {
        System.out.println("Finalization " + x);
    }

    //Generating object immediately deleting
    void generator(int i){
        FinalizeDemo o = new FinalizeDemo(i);
    }
}

class Finalize {
    public static void main(String[] args) {
        int count;
        FinalizeDemo ob = new FinalizeDemo(0);
        //More objects to activate trasher

        for (count = 1; count < 100000; count++) {
            ob.generator(count);
        }
    }
}