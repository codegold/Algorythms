package src.OrderedArray;

public class OrdArray {
    private int[] a;
    private int nElems;

    public OrdArray(int value) {
        a = new int[value];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(int searchKey) {
        int startLimit = 0;
        int endLimit = nElems - 1;
        int curr;

        while (true) {
            curr = (startLimit + endLimit) / 2;
            if (a[curr] == searchKey)
                return curr;
            else if (startLimit > endLimit)
                return nElems;
            else {
                if (a[curr] < searchKey)
                    startLimit = curr + 1;
                else
                    endLimit = curr - 1;

            }
        }
    }

    public void insert(int value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] > value) break;
        for (int k = nElems; k > j; k--)
            a[k] = a[k - 1];

        a[j] = value;
        nElems++;
    }

    public void simpleInsert(int value){
        for (int i = 0; i < nElems; i++)
            if(a[i] > value)break;

            a[nElems] = value;
            nElems++;

    }

    public boolean delete(int value) {
        int j = find(value);
        if (j == nElems) return false;
        else {
            for (int i = 0; i < nElems; i++)
                if (a[j] == value) break;
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];

            nElems--;
            return true;

        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
