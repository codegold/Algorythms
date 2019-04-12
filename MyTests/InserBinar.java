package MyTests;

public class InserBinar {
    private int []a = {1};
    private int nElems = 1;
    int value = 1;
    public void insertBinary(int value) {        //Binary search
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        int j;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] > value && (curIn == 0 ||
                    (curIn - 1 >= 0 && a[curIn - 1] < value))) {
                j = curIn;
                break;
            } else if (lowerBound > upperBound) {
                j = nElems;
                break;
            } else {                               //divide range
                if (a[curIn] < value)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1;  // В нижней половине
            }
        }
        for (int k = nElems; k < j; k--)   // move bigger ones up
            a[k] = a[k - 1];
        a[j] = value;                                // insert it
        nElems++;                               // increment size
    }

    //-----------------------------------------------------------
}




