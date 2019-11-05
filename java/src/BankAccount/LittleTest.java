package src.BankAccount;

public class LittleTest {
    public static void main(String[] args) {
    }

    int[] aaa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 23, 24, 25, 26};
    int nElems = 17;

    public int findBin(int value) {
        int startLimit = 0;
        int endLimit = nElems - 1;
        int curr;
        int searchKey = 25;

        while (true) {
            curr = (startLimit + endLimit) / 2;
            if (aaa[curr] == searchKey) return curr;
            else if (startLimit > endLimit) return Integer.parseInt("not found");
            else {
                if (aaa[curr] < searchKey) {
                    endLimit = aaa[curr - 1];
                } else startLimit = aaa[curr + 1];
            }

        }
    }
}
