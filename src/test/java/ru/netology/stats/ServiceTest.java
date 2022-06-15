package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServiceTest {
    int[] nubmerOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void salesAmountTest() {
        SalesAmount amount = new SalesAmount();
        int expected = 180;
        int actual = amount.calculate(nubmerOfSales);
        assertEquals(expected, actual);
    }

    @Test
    void averageAmountTest() {
        AverageAmount average = new AverageAmount();
        int expected = 15;
        int actual = average.calculate(nubmerOfSales);
        assertEquals(expected, actual);
    }

    @Test
    void maxMonthTest() {
        MaxMonth max = new MaxMonth();
        int expected = 8;
        int actual = max.calculate(nubmerOfSales);
        assertEquals(expected, actual);
    }

    @Test
    void minMonthTest() {
        MinMonth min = new MinMonth();
        int expected = 9;
        int actual = min.calculate(nubmerOfSales);
        assertEquals(expected, actual);
    }
    @Test
    void belowAverageTest() {
        BelowAverage monthBelow= new BelowAverage();
        int expected = 5;
        int actual = monthBelow.calculate(nubmerOfSales);
        assertEquals(expected, actual);
    }

    @Test
    void aboveAverageTest() {
        AboveAverage monthAbove= new AboveAverage();
        int expected = 5;
        int actual = monthAbove.calculate(nubmerOfSales);
        assertEquals(expected, actual);
    }
}
