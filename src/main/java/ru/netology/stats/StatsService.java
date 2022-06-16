package ru.netology.stats;

public class StatsService {
    int[] numberOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int salesAmount(int[] numberOfSales) {
        int amount = 0;
        for (int i = 0; i < numberOfSales.length; i++) {
            amount += numberOfSales[i];
        }
        System.out.println("Сумма продаж - " + amount);
        return amount;
    }

    public int averageAmount(int[] numberOfSales) {
        int sum = 0;
        for (int numberOfSale : numberOfSales) {
            sum += numberOfSale;
        }
        int average = sum / numberOfSales.length;
        System.out.println("Средняя сумма продаж в месяц - " + average);
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
        System.out.println("Номер месяца, в котором был пик продаж - " + maxMonth);
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
        System.out.println("Номер месяца, в котором был минимум продаж - " + minMonth);
        return minMonth;
    }

    public int belowAverageTest1(int[] numberOfSales) {
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
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего - " + belowAverage);
        return belowAverage;
    }

    public int aboveAverage(int[] numberOfSales) {
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
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего - " + aboveAverage);
        return aboveAverage;
    }

}
