package Linear;

public class Test {
    public static void main(String[] args) {
        int[]A = {1,2,3,4,5,6,7,88};
        System.out.println(linearSearch(A, 89));
    }
    public static int linearSearch(int[]A, int k) {
        for(int i=0; i<A.length; i++) {
            if (A[i] == k)
                return i;
        }
        return -1;
    }
}
