package com.example.skyprospringhomework212testing.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.skyprospringhomework212testing.constants.CalculatorServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorServiceParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    public void shouldGenerateCorrectPlusMessages(int Num1, int Num2, String expectedMessage) {
        String result = out.plus(Num1, Num2);
        assertEquals(expectedMessage, result);
    }
    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(NUM1_1,NUM2_1,PLUS_MESSAGE_1),
                Arguments.of(NUM1_2,NUM2_2,PLUS_MESSAGE_2)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    public void shouldGenerateCorrectMinusMessages(int Num1, int Num2, String expectedMessage) {
        String result = out.minus(Num1, Num2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(NUM1_1,NUM2_1,MINUS_MESSAGE_1),
                Arguments.of(NUM1_2,NUM2_2,MINUS_MESSAGE_2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultTest")
    public void shouldGenerateCorrectMultMessages(int Num1, int Num2, String expectedMessage) {
        String result = out.multiplication(Num1, Num2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParamsForMultTest() {
        return Stream.of(
                Arguments.of(NUM1_1,NUM2_1,MULT_MESSAGE_1),
                Arguments.of(NUM1_2,NUM2_2,MULT_MESSAGE_2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivTest")
    public void shouldGenerateCorrectDivMessages(int Num1, int Num2, String expectedMessage) {
        String result = out.division(Num1, Num2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParamsForDivTest() {
        return Stream.of(
                Arguments.of(NUM1_1,NUM2_1,DIV_MESSAGE_1),
                Arguments.of(NUM1_2,NUM2_2,DIV_MESSAGE_2)
        );
    }


}
