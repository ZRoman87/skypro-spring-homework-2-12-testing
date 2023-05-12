package com.example.skyprospringhomework212testing.controller;

import com.example.skyprospringhomework212testing.service.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcomeToCalculator(){
        return calculatorService.welcomeToCalculator();
    }

    @GetMapping (path = "/plus")
    public String plus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2){
        if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка: параметры введены не корректно";
        }
        return calculatorService.plus(Integer.parseInt(num1), Integer.parseInt(num2));
    }

    @GetMapping (path = "/minus")
    public String minus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2){
        if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка: параметры введены не корректно";
        }
        return calculatorService.minus(Integer.parseInt(num1), Integer.parseInt(num2));
    }

    @GetMapping (path = "/multiply")
    public String multiplication(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2){
        if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка: параметры введены не корректно";
        }
        return calculatorService.multiplication(Integer.parseInt(num1), Integer.parseInt(num2));
    }

    @GetMapping (path = "/divide")
    public String division(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2){
        if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка: параметры введены не корректно";
        }
        return calculatorService.division(Integer.parseInt(num1), Integer.parseInt(num2));
    }
}
