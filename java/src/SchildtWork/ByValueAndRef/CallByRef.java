package src.SchildtWork.ByValueAndRef;

public class CallByRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("ob.a and ob.b before call "+ob.a +" "+ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call "+ob.a +" "+ob.b);
    }
}
