package src.SchildtWork.Exceptions;

public class excDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Before generating exception");

            nums[7] = 10;
            System.out.println("This will not be printed.");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of bounds");
        }
        System.out.println("After operator catch");
    }
}
