package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int [] nubmerOfSales =  {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        SalesAmount amount= new SalesAmount ();
        int salesAmount=amount.calculate(nubmerOfSales);
        System.out.println("Сумма всех продаж - " + salesAmount);

        AverageAmount average= new AverageAmount();
        int averageAmount=average.calculate(nubmerOfSales);
        System.out.println("Средняя сумма продаж в месяц - "+ averageAmount);

        MaxMonth max= new MaxMonth ();
        int maxMonth=max.calculate(nubmerOfSales);
        System.out.println("Номер месяца, в котором был пик продаж - " + maxMonth);

        MinMonth min= new MinMonth ();
        int minMonth=min.calculate(nubmerOfSales);
        System.out.println("Номер месяца, в котором был минимум продаж - " + minMonth);

        BelowAverage monthBelow= new BelowAverage ();
        int belowAverage=monthBelow.calculate(nubmerOfSales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего - " + belowAverage);

        AboveAverage monthAbove= new AboveAverage ();
        int aboveAverage=monthAbove.calculate(nubmerOfSales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего - " + aboveAverage);
    }
}
