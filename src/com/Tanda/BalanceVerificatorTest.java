package com.Tanda;

import org.junit.Assert;
import org.junit.Test;

public class BalanceVerificatorTest {

    @Test
    public void verify() {
        int expected = -1;
        String input = " {[]}";
        BalanceVerificator balance = new BalanceVerificator();
        int actual = balance.verify(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void verify1() {
        int expected = -1;
        String input = "{[()]}";
        BalanceVerificator balance = new BalanceVerificator();
        int actual = balance.verify(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void verify2() {
        int expected = -1;
        String input = "{[(]}";
        BalanceVerificator balance = new BalanceVerificator();
        int actual = balance.verify(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void verify3() {
        int expected = -1;
        String input = "{{[[(())]]}}";
        BalanceVerificator balance = new BalanceVerificator();
        int actual = balance.verify(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void verify4() {
        int expected = -1;
        String input = "s[]";
        BalanceVerificator balance = new BalanceVerificator();
        int actual = balance.verify(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void verify5() {
        int expected = -1;
        String input = "{{[{{[]}}]}";
        BalanceVerificator balance = new BalanceVerificator();
        int actual = balance.verify(input);
        Assert.assertEquals(expected, actual);
    }
}