package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {

    @Test

    public void test1() {
        CashbackHacker cash = new CashbackHacker();
        int amount = 2900;
        int actual = cash.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }
}

