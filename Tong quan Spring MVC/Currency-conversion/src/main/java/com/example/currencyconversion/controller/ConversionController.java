package com.example.currencyconversion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConversionController {
    @GetMapping("/convert")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("view");
        return modelAndView;
    }

    @PostMapping("/convert")
    public ModelAndView convert(@RequestParam double usd, @RequestParam double currency) {
        double result = usd * currency;
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
