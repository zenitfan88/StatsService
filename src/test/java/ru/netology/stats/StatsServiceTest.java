package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {
    int[] numberOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void salesAmountTest() {
        StatsService amount = new StatsService();
        int expected = 180;
        int actual = amount.salesAmount(numberOfSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageAmountTest() {
        StatsService average = new StatsService();
        int expected = 15;
        int actual = average.averageAmount(numberOfSales);
        Assertions.assertEquals(expected, actual);;
    }

    @Test
    void maxMonthTest() {
        StatsService maxMonth = new StatsService();
        int expected = 8;
        int actual = maxMonth.maxMonth(numberOfSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minMonthTest() {
        StatsService minMonth = new StatsService();
        int expected = 9;
        int actual = minMonth.minMonth(numberOfSales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void belowAverageTest() {
        StatsService belowAverage= new StatsService();
        int expected = 5;
        int actual = belowAverage.belowAverageTest1(numberOfSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void aboveAverageTest() {
        StatsService aboveAverage= new StatsService();
        int expected = 5;
        int actual = aboveAverage.aboveAverage(numberOfSales);
        Assertions.assertEquals(expected, actual);
    }
}
