package ie.atu;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd() {
        myCalc = new Calculator();
        assertEquals(40, myCalc.add(20,20));
    }

    private void assertEquals(int i, int add) {
    }

    @Test
    public void testDelete() {
        myCalc = new Calculator();
        assertEquals(0, myCalc.subtract(20,20));
    }

    @Test
    public void testMultiply() {
        myCalc = new Calculator();
        assertEquals(25, myCalc.multiply(5,5));
    }

    @Test
    public void testDivide() {
        myCalc = new Calculator();
        assertEquals(4, myCalc.divide(8,2));
    }
}