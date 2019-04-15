package Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);              //Очередь из 5 ячеек

        theQueue.insert(10);                        //Вставка 4 элементов
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();                         //Извлечение 3 элементов
        theQueue.remove();                           //10,20,30
        theQueue.remove();

        theQueue.insert(50);                    //Вставка еще 4 элементов
        theQueue.insert(60);                    //С циклическим переносом
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()){                   //Извлечение и вывод
            long n = theQueue.remove();                    //Всех элементов
            System.out.print(n);                          //(40,50,60,70,80
            System.out.print(" ");
        }
        System.out.println("");
    }
}

