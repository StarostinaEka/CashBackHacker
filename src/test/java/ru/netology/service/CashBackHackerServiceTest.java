
package ru.netology.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CashBackHackerServiceTest {
    @Test
    public void shouldCalculateMissingQty() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
       Assertions.assertEquals(actual, expected);
    }

    @Test
    public void amountEqualBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void amountMoreBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        Assertions.assertEquals(actual, expected);
    }

}
