package ru.netology.stats;

public class SalesAmount {
    public int calculate(int[] nubmerOfSales) {
        int amount = 0;
        for (int i = 0; i < nubmerOfSales.length; i++) {
            amount += nubmerOfSales[i];
        }
        return amount;
    }
}
