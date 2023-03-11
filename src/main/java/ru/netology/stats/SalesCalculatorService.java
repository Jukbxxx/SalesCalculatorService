package ru.netology.stats;

public class SalesCalculatorService {
    public int getMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getSalesSum(long[] sales) {
        int sum = 0; // сумма всех продаж
        for (long amount : sales) { // amount - количество продаж в рамках одного месяца
            sum += amount; // суммируем количество продаж за все месяцы
        }
        return sum;
    }

    public int getAverageSales(long[] sales) {
        int sum = getSalesSum(sales); // берем сумму всех продаж, получаемую при помощи нашего метода выше
        int average = sum / sales.length; // делим сумму на количество месяцев в массиве данных
        return average;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMonthsBelowAverage(long[] sales) {
        int belowAverageNumber = 0; // количество месяцев с продажами ниже среднего
        int salesAverage = getAverageSales(sales); //переменная для хранения среднего количества продаж

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAverage) {
                belowAverageNumber = belowAverageNumber + 1; // если продажи в рассматриваемом месяца были ниже среднего, прибавляем 1
            }
        }
        return belowAverageNumber;
    }

    public int getMonthsAboveAverage(long[] sales) {
        int aboveAverageNumber = 0; // количество месяцев с продажами выше среднего
        int salesAverage = getAverageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAverage) { // логика по аналогии с методом выше
                aboveAverageNumber = aboveAverageNumber + 1;
            }
        }
        return aboveAverageNumber;
    }

}

