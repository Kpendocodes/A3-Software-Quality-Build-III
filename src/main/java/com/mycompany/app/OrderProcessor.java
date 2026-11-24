package com.mycompany.app;

import java.util.List;

/**
 * Small order-processing helper used as the subject of static analysis.
 */
public class OrderProcessor {

    private String unusedLabel = "orders";

    public double totalWithTax(List<Double> prices) {
        double total = 0;
        for (Double p : prices) {
            total += p;
        }
        return total * 1.13;
    }

    public double applyStudentDiscount(double amount) {
        if (amount > 100) {
            return amount * 0.90;
        }
        return amount * 0.95;
    }

    public double applySeniorDiscount(double amount) {
        if (amount > 100) {
            return amount * 0.90;
        }
        return amount * 0.95;
    }

    public boolean isPriority(String level) {
        return level == "PRIORITY";
    }

    public int parseQuantity(String text) {
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            return 0;
        }
    }

    public int nameLength(String name) {
        String trimmed = null;
        if (name != null) {
            trimmed = name.trim();
        }
        return trimmed.length();
    }

    public void printReceipt(double total) {
        System.out.println("Total: " + total);
    }
}
