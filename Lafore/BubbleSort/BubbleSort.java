package Lafore.BubbleSort;


class BubbleSortApp {
    public static void main(String[] args) {

        int maxSize = 22;
        ArrayBub arr = new ArrayBub(maxSize);       //Create array with size

//        arr.insert(77);
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(00);
//        arr.insert(66);
//        arr.insert(33);
//
//        arr.display();
//
//        arr.bubbleSort();
//        arr.display();
//
//        ArrayBub arr2 = new ArrayBub(5);
//        arr2.insert(77);
//        arr2.insert(90);
//        arr2.insert(33);
//        arr2.insert(44);
//        arr2.insert(10);
//        //arr2.insert(10);
//        System.out.println();
//        arr2.display();
//        arr2.bubbleSort();
//        System.out.println();
//        arr2.display();


        for (int j = 0; j < maxSize; j++) {
            int n = (int) (java.lang.Math.random() * (maxSize - 1));
            arr.insert(n);
        }
        arr.display();
        System.out.println();
        //arr.bubbleSortTwoInCycles();
        arr.OddEvenSort();
        arr.display();
    }

}



