package com.akadatsly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void div() {
        assertThat(calculator.div(8, 2), is(4));
    }

    @Test
    void whenException() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }


    @Test
    void getInstance() {
        Assertions.assertNotNull(Calculator.getInstance());
    }

}