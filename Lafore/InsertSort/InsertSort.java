package Lafore.InsertSort;

class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 22;
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

        arr.insertionSortWithCounting();
        arr.display();
        System.out.println();
        System.out.println("Its arr.median: " +arr.median());
        arr.display();
        arr.noDuplicates();
        arr.display();
        //System.out.println("Its arr.median: " +arr.median());
        System.out.println();

        MyArrayIns arr2 = new MyArrayIns(maxSize);
        arr2.insert(0);
        arr2.insert(1);
        arr2.insert(3);
        arr2.insert(4);
        arr2.insert(4);
        arr2.insert(5);
        arr2.insert(5);
        arr2.insert(5);
        arr2.insert(18);
        arr2.insert(18);
        arr2.insert(20);
        arr2.insert(15);
        arr2.insert(10);
        arr2.insert(10);
        arr2.insert(9);
        arr2.insert(9);

        arr2.display();
        arr2.insertionSortWithCounting();
        arr2.display();
        System.out.println();

    }
}
