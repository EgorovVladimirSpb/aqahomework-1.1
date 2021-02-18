package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldReturn1000IfAmount0() {

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn999ifAmountIs1() {

        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn500IfAmountIs500() {

        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn1IfAmountIs999() {

        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn0IfAmountIs1000() {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn999IfAmountIs1001() {

        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn500IfAmountIs1500() {

        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn1IfAmountIs1999() {

        int amount = 1999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }
}