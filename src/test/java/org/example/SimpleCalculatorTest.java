package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        Assert.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void threePluSevenShouldEqualTen() {
        var calculator = new SimpleCalculator();
        Assert.assertEquals(10, calculator.add(3, 7));
    }
}


