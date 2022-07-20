package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int result = service.remain(amount);

        assertEquals(result, expected);
    }
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int result = service.remain(amount);

        assertEquals(result, expected);
    }
}