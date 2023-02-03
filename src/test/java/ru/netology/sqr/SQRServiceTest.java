package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test

    public void shouldCalcSqrInDiapason() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSqr(100, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotGetSqrIntoDiapason() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(1, 99);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldCalcSqrInNegativeDiapason() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(-100, -200);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldCalcSqrInOverDiapason() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(10_000, 11_000);

        Assertions.assertEquals(expected, actual);
    }
}
