package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesCalculatorServiceTest {

    @Test
    public void shouldFindMinSalesBetweenEnds() {
        SalesCalculatorService service = new SalesCalculatorService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldCalcSum() {
        SalesCalculatorService service = new SalesCalculatorService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.getSalesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalcAverage() {
        SalesCalculatorService service = new SalesCalculatorService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.getAverageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldFindMaxBetweenEnds() {
        SalesCalculatorService service = new SalesCalculatorService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindBelowAverageNumber() {
        SalesCalculatorService service = new SalesCalculatorService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverageNumber = 5;
        int actualBelowAverageNumber = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedBelowAverageNumber, actualBelowAverageNumber);
    }

    @Test
    public void shouldFindAboveAverageNumber() {
        SalesCalculatorService service = new SalesCalculatorService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverageNumber = 5;
        int actualAboveAverageNumber = service.getMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedAboveAverageNumber, actualAboveAverageNumber);

    }

}
