package com.example.caculator.controller;

import com.example.caculator.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    ICaculatorService caculatorService;
    @GetMapping("/")
    public String showCaculator() {
        return "/index";
    }

    @RequestMapping("/caculator")
    public String caculator(ModelMap modelMap, @RequestParam(name = "num1", defaultValue = "0") double num1,
                            @RequestParam(name = "num2", defaultValue = "0") double num2,
                            @RequestParam(name = "caculator", defaultValue = "") String caculator) {
        modelMap.addAttribute("result", caculatorService.caculator(num1, num2, caculator));
        return "/index";
    }
}