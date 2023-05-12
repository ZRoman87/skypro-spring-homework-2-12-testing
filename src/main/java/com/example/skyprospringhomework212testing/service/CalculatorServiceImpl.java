package com.example.skyprospringhomework212testing.service;

import com.example.skyprospringhomework212testing.exception.CalculatorIllegalArgumentException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl {

    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplication(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String division(int num1, int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        } else {
            //return "Ошибка: деление на 0";
            throw new CalculatorIllegalArgumentException();
        }
    }
}
