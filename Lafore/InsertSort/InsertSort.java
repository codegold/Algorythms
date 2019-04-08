package Lafore.InsertSort;

class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 10;
        MyArrayIns arr = new MyArrayIns(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int n = (int) (java.lang.Math.random() * (maxSize -1));
            arr.insert(n);
        }

//        arr.insert(77);
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);


        arr.display();

        arr.insertionSort();
        arr.display();
        System.out.println();
        System.out.println(arr.median());
        arr.display();
        arr.noDups();
        arr.display();
        arr.median();

    }
}
