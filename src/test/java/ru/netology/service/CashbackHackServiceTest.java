package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 800;
        int amount = 1200;
        int result = service.remain(amount);

        assertEquals(expected,result);
    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;
        int result = service.remain(amount);

        assertEquals(expected,result);
    }
}