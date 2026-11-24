package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void isPriorityComparesContentNotReference() {
        String runtimeValue = new StringBuilder("PRIORITY").toString();
        assertTrue(processor.isPriority(runtimeValue));
        assertFalse(processor.isPriority("STANDARD"));
        assertFalse(processor.isPriority(null));
    }

    @Test
    void nameLengthHandlesNullAndTrimsWhitespace() {
        assertEquals(0, processor.nameLength(null));
        assertEquals(3, processor.nameLength("  Bob "));
    }
}
