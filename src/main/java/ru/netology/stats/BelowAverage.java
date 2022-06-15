package ru.netology.stats;

public class BelowAverage {
    public int calculate(int[] numberOfSales) {
        int sum = 0;
        for (int numberOfSale : numberOfSales) {
            sum += numberOfSale;
        }
        int average = sum / numberOfSales.length;
        int belowAverage = 0;
        for (int numberOfSale : numberOfSales) {
            if (numberOfSale < average) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }
}
