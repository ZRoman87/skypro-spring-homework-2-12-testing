package com.example.skyprospringhomework212testing.service;

import org.junit.jupiter.api.Test;

import static com.example.skyprospringhomework212testing.constants.CalculatorServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    @Test
    public void shouldReturnWelcomeMessage() {
        String result = out.welcomeToCalculator();
        assertEquals(WELCOME_MESSAGE, result);
     }

    @Test
    public void shouldReturnCorrectPlusMessage() {

        String result1 = out.plus(NUM1_1, NUM2_1);
        assertEquals(PLUS_MESSAGE_1, result1);

        String result2 = out.plus(NUM1_2, NUM2_2);
        assertEquals(PLUS_MESSAGE_2, result2);
    }

    @Test
    public void shouldReturnCorrectMinusMessage() {

        String result1 = out.minus(NUM1_1, NUM2_1);
        assertEquals(MINUS_MESSAGE_1, result1);

        String result2 = out.minus(NUM1_2, NUM2_2);
        assertEquals(MINUS_MESSAGE_2, result2);
    }

    @Test
    public void shouldReturnCorrectMultiplicationMessage() {

        String result1 = out.multiplication(NUM1_1, NUM2_1);
        assertEquals(MULT_MESSAGE_1, result1);

        String result2 = out.multiplication(NUM1_2, NUM2_2);
        assertEquals(MULT_MESSAGE_2, result2);
    }

    @Test
    public void shouldReturnCorrectDivisionMessage() {

        String result1 = out.division(NUM1_1, NUM2_1);
        assertEquals(DIV_MESSAGE_1, result1);

        String result2 = out.division(NUM1_2, NUM2_2);
        assertEquals(DIV_MESSAGE_2, result2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenSecondParameterEqualsZero() {
        assertThrows(IllegalArgumentException.class,
                () -> out.division(NUM1_1, 0)
        );
    }
}
