package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class OrderProcessorTest {

    private final OrderProcessor processor = new OrderProcessor();

    @Test
    void totalWithTaxAddsThirteenPercent() {
        assertEquals(113.0, processor.totalWithTax(List.of(50.0, 50.0)), 0.001);
    }

    @Test
    void studentDiscountOnLargeAmount() {
        assertEquals(180.0, processor.applyStudentDiscount(200.0), 0.001);
    }

    @Test
    void parseQuantityReadsValidNumber() {
        assertEquals(7, processor.parseQuantity("7"));
    }
}
