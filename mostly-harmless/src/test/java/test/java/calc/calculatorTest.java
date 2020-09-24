package test.java.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.calc.Calculator;

public class calculatorTest {
    @Test
    public void twoAndZeroIsTwo() throws Exception {
        final long result = new Calculator().add(2, 0);
        assertEquals(result, 2L);
    }
    @Test
    public void twoAndMinusTwoIsZero() throws Exception {
        final long result = new Calculator().add(2, -2);
        assertEquals(result, 0L);
    }
    @Test
    public void threeMinusTwoIsOne() throws Exception {
        final long result = new Calculator().subtract(3, 2);
        assertEquals(result, 1L);
    }
    @Test
    public void threeMinusThreeIsZero() throws Exception {
        final long result = new Calculator().subtract(3, 3);
         assertEquals(result, 0L);
    }
    @Test
    public void threeMinusMinusThreeIsSix() throws Exception {
        final long result = new Calculator().subtract(3, -3);
        assertEquals(result, 6L);
    }
    @Test
    public void threeXThreeIsNine() throws Exception {
        final long result = new Calculator().multiply(3, 3);
        assertEquals(result, 9L);
    }
    @Test
    public void threeXZeroIsZero() throws Exception {
        final long result = new Calculator().multiply(3, 0);
         assertEquals(result, 0L);
    }
    @Test
    public void threeXMinusThreeIsMinusNine() throws Exception {
        final long result = new Calculator().multiply(3, -3);
        assertEquals(result, -9L);
    }
    @Test
    public void onePlusOneIsFive() throws Exception {
    	final long result = new Calculator().add(1, 4);
    	assertEquals(result, 5L);
    }

}
