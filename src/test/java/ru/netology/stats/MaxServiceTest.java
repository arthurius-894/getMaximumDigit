package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void shouldFindMax() {
        MaxService service = new MaxService();

        int a = 89;
        int b = 8;

        int expected = a;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}