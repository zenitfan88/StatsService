package ru.netology.stats;

public class MaxMonth {
    public int calculate(int[] nubmerOfSales) {
        int month = 0;
        int maxMonth = 0;
        for (int nubmerOfSale : nubmerOfSales) {
            if (nubmerOfSale >= nubmerOfSales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
}

