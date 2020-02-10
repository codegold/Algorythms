package src.SchildtWork.ByValueAndRef;

public class Test {
    int a, b;

    Test (int i, int j){
        a = i;
        b = j;
    }

    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }

    void change(Test ob) {
        ob.a = ob.a+ ob.b;
        ob.b = -ob.b;
    }
}
