package com.example.caculator.service;

import org.springframework.stereotype.Service;

@Service
public class caculatorService implements ICaculatorService {
    @Override
    public String caculator(double num1, double num2, String caculator) {
        double result = 0;
        switch (caculator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    break;
                } else {
                    return "Cannot divide by zero";
                }
        }
        return String.valueOf(result);
    }
}
