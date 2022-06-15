package ru.netology.stats;

public class AboveAverage {
    public int calculate(int[] numberOfSales) {
        int sum = 0;
        for (int numberOfSale : numberOfSales) {
            sum += numberOfSale;
        }
        int average = sum / numberOfSales.length;
        int aboveAverage = 0;
        for (int numberOfSale : numberOfSales) {
            if (numberOfSale > average) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }
}

