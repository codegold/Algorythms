package src.OrderedArray;

import static src.BubbleSort.MyBubbleSort.swap;

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

    public int findTwo(int searchKey) {
        return recursFind(searchKey, 0, nElems - 1);
    }

    public int recursFind(int searchKey, int lower, int upper) {
        int curr = (lower + upper) / 2;
        if (a[curr] == searchKey)
            return curr;
        else if (lower > upper)
            return nElems;
        else {
            if (searchKey < a[curr])
                return recursFind(searchKey, lower, curr - 1);
            else
                return recursFind(searchKey, curr + 1, upper);
        }
    }

    public void insert(int value) {
        int start = 0;
        int end = nElems - 1;
        int curr = 0;

        while (true) {

            if (start > end) break;
            curr = (start + end) / 2;
            if (value > a[curr]) {
                start = curr + 1;
                curr++;

            } else end = curr - 1;
        }

        for (int k = nElems; k > curr; k--)
            a[k] = a[k - 1];

        a[curr] = value;
        nElems++;
    }

    public void insertTwo(int value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] > value)
                break;
        }
        for (int k = nElems; k > j; k--) {
            a[k] = a[k - 1];
            a[j] = value;
            nElems++;
        }
    }

    public void simpleInsert(int value) {
        for (int i = 0; i < nElems; i++)
            if (a[i] > value) break;

        a[nElems] = value;
        nElems++;

    }

    public boolean delete(int value) {
        int j = find(value);
        int start = 0;
        int end = nElems - 1;
        int curr = (start + end) / 2;

        if (value == nElems) return false; // can’t find it
        else {
            if (curr == j)
                return true;
            else if (start > end) return false;
            else {
                if (a[curr] > j) end = curr - 1;
                else start = curr + 1;
            }
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }

    public void sortMy(int[] a) {
        for (int i = a.length; i > 0; i--)
            for (int j = i - 1; j > 0; j--)
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
    }


    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }


    public static OrdArray merge(OrdArray a, OrdArray b) {

        int myLength = a.size() + b.size(); //Set needed length.
        OrdArray newArray = new OrdArray(myLength * 2);
        int counterA = 0, counterB = 0, counterC = 0;

        while (counterA < a.size() && counterB < b.size()) {//пока счетчики не дошли до конца массивов

            if (a.getValueAt(counterA) <= b.getValueAt(counterB)) {//если элем первый меньш равен второму

                newArray.setValueAt(counterC, a.getValueAt(counterA));  //назначаем новому первый а
                counterA++; //двигаемся по массиву

            } else {
                newArray.setValueAt(counterC, b.getValueAt(counterB)); //иначе назначаем первый б (б больше)
                counterB++; //двигаемся по массиву
            }
            newArray.nElems++; //увеличиваем размер нового массива
            counterC++; //двигаемся по новому массиву

        }
        while (counterA < a.size()) {

            newArray.setValueAt(counterC, a.getValueAt(counterA));
            newArray.nElems++;
            counterC++;
            counterA++;
        }

        while (counterB < b.size()) {

            newArray.setValueAt(counterC, b.getValueAt(counterB));
            newArray.nElems++;
            counterC++;
            counterB++;
        }

        return newArray;
    }

    private void setValueAt(int index, long value) {
        a[index] = (int) value;
    }

    private int getValueAt(int index) {
        return a[index];
    }

    private int biggestMy(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public void noDupsMy() {
        for (int i = 0; i < nElems; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] == a[j]) {
                    for (int k = j; k < nElems; k++) {
                        a[k] = a[k + 1];
                    }
                    nElems--;
                    j--;
                }
            }
        }

    }

    public void noDupsGit() {

        for (int i = 0; i < nElems; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] == a[j]) {
                    for (int k = j; k < nElems; k++) {
                        a[k] = a[k + 1];
                    }
                    nElems--;
                    j--;//WTF
                }
            }
        }
    }


    public static OrdArray mergeTwo(OrdArray a, OrdArray b) {
        int newLength = a.nElems + b.nElems;
        OrdArray newArray = new OrdArray(a.size() + b.size());
        int ac = 0, bc = 0, nc = 0;

        while (ac < a.size() && bc < b.size()) {
            newArray.setValueAt(nc, a.getValueAt(ac));
        }

//        for (int i = 0; i < a.nElems; i++) {
//            newArray.setValueAt(i, a.getValueAt(i));
//        }
        return newArray;
    }


}
