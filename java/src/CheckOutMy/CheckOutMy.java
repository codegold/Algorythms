package src.CheckOutMy;

import src.Queue.Queue;

public class CheckOutMy {

    private int numQueues;
    private int maxQueSize;
    private Queue fastLine;
    private Queue[] queues;

    private long cashierTime;
    private double percent;

    public CheckOutMy(int numQueues, int maxQueSize, boolean fast) {
        this.numQueues = numQueues;
        this.maxQueSize = maxQueSize;
        queues = new Queue[numQueues];

        if (fast) fastLine = new Queue(maxQueSize); //если задана быстрая

        for (int i = 0; i < numQueues; i++) { //по количеству наполняем очереди
            queues[i] = new Queue(maxQueSize);
        }

        cashierTime = 15; // Время у кассы
    }

    public void addCustomer() {
        long customerBuy = (long) Math.ceil(Math.random() * 30); //Не больше 30 товаров
        int shortestCashier = 0;
        long shortestLength = Long.MAX_VALUE;
        long temp = 0;

        //Чекнем быструю кассу
        if (fastLine != null & customerBuy <= 10) {
            temp = cashierTime * fastLine.size();

            for (int i = 0; i < fastLine.size(); i++) {
                temp += fastLine.itemAt(i); //Сосчитали время на короткой кассе
                if (shortestLength > temp) {
                    shortestCashier = -1;
                    shortestLength = temp;
                }
            }
            // Чекнем остальные очереди
            for (int i = 0; i < queues.length; i++) {
                temp = cashierTime * queues[i].size();

                for (int j = 0; j < queues[i].size(); j++) {
                    temp += queues[i].itemAt(j);
                    if (shortestLength > temp) {
                        shortestCashier = i;
                        shortestLength = temp;
                    }
                }

                if (shortestLength == -1) {
                    fastLine.insert(customerBuy);
                    System.out.println("Customer buy " + customerBuy + "Added to fast line.");
                    fastLine.justAdded = true;
                } else {
                    queues[shortestCashier].insert(customerBuy);
                    System.out.println("Customer buy " + customerBuy + "Added to usual line " + (shortestCashier++));

                    if (queues[shortestCashier].runningTally <= 0)
                        queues[shortestCashier].justAdded = true;
                }

            }

        }
    }

    public void process(int time) {
        for (int i = 0; i < time; i++) {

            for (int j = 0; j < queues.length; j++) {//go through each queue and update
                if (queues[i].runningTally <= 0) { //if cashier has finished customer

                    //remove front customer and get new one
                    if (!queues[j].isEmpty() && !queues[j].justAdded)
                        queues[j].remove();
                    int justReduce;

                    //Прикинем текущий тотал?
                    queues[j].runningTally = queues[j].peekFront();


                } else queues[j].runningTally--; //decrement runningTally for each tick
                queues[j].justAdded = false;  //after 1 tick, any new items can be processed
            }

            if (fastLine != null) {
                if (fastLine.runningTally <= 0) {
                    if (!fastLine.isEmpty() && !fastLine.justAdded) fastLine.remove();
                    fastLine.justAdded = false;
                }
                if ((Math.random() * 100) <= percent)
                    addCustomer();
            }
        }
    }


}
