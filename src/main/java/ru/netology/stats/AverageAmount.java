package ru.netology.stats;

public class AverageAmount {
    public int calculate(int[] numberOfSales) {
        int sum = 0;
        for (int numberOfSale : numberOfSales) {
            sum += numberOfSale;
        }
        int average = sum / numberOfSales.length;
        return average;
    }
}
