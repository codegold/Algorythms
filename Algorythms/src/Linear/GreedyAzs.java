package Linear;

public class GreedyAzs {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, 400));
    }

    public static int minStops(int[] stations, int capacity) {
        int result = 0;
        int currentStop = 0;
        while (currentStop < stations.length - 1) { //работаем пока не доедем до последней остановки
            int nextStop = currentStop; //стоя на КАРРЕНТ вычисляем где выгоднее заправится
                                        //заводим переменную КАРРЕНТ для след шага

            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity)
                    //проверяем, можем ли доехать до след заправки
                    //проверяем какое у нас расстояние между текущ и след точкой
                    // если меньше 400 идем дальше. Увеличиваем индекс след заправки
                nextStop++; //Это крутится пока не доедем или расстояние будет больше Капасити

            //Если не возмоно доехать до финиша, ниже проверяется это
            if (currentStop == nextStop) //Значит мы не можем доехать ни до одной след азс
                return -1;
            //Проверить не является ли след точка финишем
            if (nextStop < stations.length - 1)
                result++;
            //когда все проверили - можем сдвинуть наше авто
            currentStop = nextStop;
        }
        return result;
    }
}

