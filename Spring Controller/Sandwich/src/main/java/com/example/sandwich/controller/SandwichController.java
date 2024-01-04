package com.example.sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String showForm() {
        return "display";
    }
    @RequestMapping("/save")
    public String save(ModelMap modelMap, @RequestParam(value = "condiment", defaultValue = "You don't choose condiment") String[] choose) {
        modelMap.addAttribute("choose", choose);
        return "save";
    }
}

