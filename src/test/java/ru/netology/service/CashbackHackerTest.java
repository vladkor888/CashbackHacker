package ru.netology.service;

import org.testng.Assert;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHacker cash = new CashbackHacker();
        int amount = 1000;
        int actual = cash.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
}