package com.ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void shouldCalculateTotal() {

        double result = App.calculateTotal(1000, 2);

        assertEquals(2000, result);
    }

    @Test
    void shouldCalculateZeroQuantity() {

        double result = App.calculateTotal(1000, 0);

        assertEquals(0, result);
    }

    @Test
    void shouldRejectNegativePrice() {

        assertThrows(
            IllegalArgumentException.class,
            () -> App.calculateTotal(-1000, 2)
        );
    }
}
