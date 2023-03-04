package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthServiceTest {

    @Test
    public void test1() {
        MonthService service = new MonthService();

        int actual = service.calculate(10_000,3_000,20_000);
        int expended = 3;

        Assertions.assertEquals(expended, actual);
    }


    @Test
    public void test2() {
        MonthService service = new MonthService();

        int actual = service.calculate(100_000,60_000,150_000);
        int expended = 2;

        Assertions.assertEquals(expended, actual);
    }


}