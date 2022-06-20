package ru.netology.stats;

public class StatsService {
    //int[] numberOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int salesAmount(int[] numberOfSales) {
        int amount = 0;
        for (int i = 0; i < numberOfSales.length; i++) {
            amount += numberOfSales[i];
        }
        return amount;
    }

    public int averageAmount(int[] numberOfSales) {
        int sum = 0;
        for (int numberOfSale : numberOfSales) {
            sum += numberOfSale;
        }
        int average = sum / numberOfSales.length;
        return average;
    }

    public int maxMonth(int[] numberOfSales) {
        int month = 0;
        int maxMonth = 0;
        for (int numberOfSale : numberOfSales) {
            if (numberOfSale >= numberOfSales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        maxMonth = maxMonth + 1;
        return maxMonth;
    }

    public int minMonth(int[] numberOfSales) {
        int month = 0;
        int minMonth = 0;
        for (int nubmerOfSale : numberOfSales) {
            if (nubmerOfSale <= numberOfSales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        minMonth = minMonth + 1;
        return minMonth;
    }

    public int belowAverageTest1(int[] numberOfSales) {
        int average = averageAmount(numberOfSales);
        int belowAverage = 0;
        for (int numberOfSale : numberOfSales) {
            if (numberOfSale < average) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }

    public int aboveAverage(int[] numberOfSales) {
        int average = averageAmount(numberOfSales);
        int aboveAverage = 0;
        for (int numberOfSale : numberOfSales) {
            if (numberOfSale > average) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }

}
