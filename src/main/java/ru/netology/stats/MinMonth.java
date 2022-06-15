package ru.netology.stats;

public class MinMonth {
    public int calculate(int[] nubmerOfSales) {
        int month = 0;
        int minMonth = 0;
        for (int nubmerOfSale : nubmerOfSales) {
            if (nubmerOfSale <= nubmerOfSales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
}
