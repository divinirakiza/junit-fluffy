package com.example.rca.classb.junittest.services;


import com.example.rca.classb.junittest.services.impls.CalculatorServiceImpl;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorServiceImplTest {

    @Test
    public void calcSum_emptyList() {
        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

        int actualResult = calculatorServiceImpl.calculateSum(new int[] {});
        int expectedResult = 0;
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void calcSum_manyElements() {
        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

        int actualResult = calculatorServiceImpl.calculateSum(new int[] {4});
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calSum_zeroElements() {
        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
        int actual = calculatorServiceImpl.calculateSum(new int[] {0, 0, 0, 0});
        int expected = 0;

        assertEquals(expected, actual);
    }

}
