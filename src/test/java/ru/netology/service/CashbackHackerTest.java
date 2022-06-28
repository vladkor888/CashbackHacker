package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {

    @Test

    public void test1() {
        CashbackHacker cash = new CashbackHacker();
        int amount = 1000;
        int actual = cash.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}

