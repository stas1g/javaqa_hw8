package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithAllEqualValues() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 5, 5, 5, 5};
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeValues() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-12, -5, -8, -4, -5};
        long expected = -4;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}

