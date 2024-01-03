package com.example.simpledictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class dictionaryController {
    @GetMapping("/dictionary")
    public ModelAndView display() {
        ModelAndView modelAndView = new ModelAndView("dictionary");
        return modelAndView;
    }

    @PostMapping("/dictionary")
    public ModelAndView dictionary(@RequestParam String word) {
        ModelAndView modelAndView = new ModelAndView("dictionary");
        String dictionary;
        if (word.equals("hello")) {
            dictionary = "xin chào";
        } else if (word.equals("goodbye")) {
            dictionary = "tạm biệt";
        } else {
            dictionary = "not found";
        }
        modelAndView.addObject("dictionary" ,dictionary);
        return modelAndView;
    }
}
