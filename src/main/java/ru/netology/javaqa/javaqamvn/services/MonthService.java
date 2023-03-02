package ru.netology.javaqa.javaqamvn.services;

public class MonthService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money += income - expenses;;
            } else {
                money = (income + money) - expenses;
            }
        }
        return count;
    }
}
