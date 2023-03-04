package ru.netology.javaqa.javaqamvn.services;

public class MonthService {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                counter++;
            } else {
                money = money + income - expenses;
            }
        }
        return counter;
    }
}
