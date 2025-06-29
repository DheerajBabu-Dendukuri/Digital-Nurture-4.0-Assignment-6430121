package com.example;
import com.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }
}
