package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    private Calculator calculator;

    @Before
    public void setupCalculator(){
        calculator = new Calculator();
        System.out.println("Setup is done....");
    }

    @After
    public void tearDownCalculator(){
        calculator = null;
        System.out.println("TearDown is done.....");
    }

    @Test
    public void testAddtion(){
        int result = calculator.add(2,3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction(){
        int result = calculator.subtract(2,3);
        assertEquals(-1, result);
    }

    @Test
    public void testMultiplication(){
        int result = calculator.multiply(2,3);
        assertEquals(6, result);
    }
}
