package src.SchildtWork.Exceptions;

public class ExcTest {
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before");

        nums[7] = 10;
        System.out.println("not printed");
    }
}

//class ExcDemo2 {
//    public static void main(String[] args) {
//        try {
//            ExcTest.genException();
//        }
////        catch (ArrayIndexOutOfBoundsException ex) {
////            System.out.println("Out of");
////        }
//        catch (ArithmeticException arex) {
//            System.out.println("After Arithmetic");
//        }
//        System.out.println("After catch");
//    }
//}

class UseThrowAbleMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standard");
            System.out.println(exc);
            System.out.println("\nStack calls");
            exc.printStackTrace();
        }
        System.out.println("After catch.");
    }
}