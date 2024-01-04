package com.example.electronicmailbox.controller;

import com.example.electronicmailbox.model.Email;
import com.example.electronicmailbox.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private IEmailService emailService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("emailList", emailService.displayAll());
        return "/list";
    }

    @GetMapping("/edit")
    public ModelAndView showFormEdit(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("/form");
        Email email = emailService.findById(id);
        modelAndView.addObject("email", email);
        modelAndView.addObject("languageList", emailService.languageList());
        modelAndView.addObject("pageSizeList", emailService.pageSizeList());
        return modelAndView;
    }

    @PostMapping("/save")
    public String saveUpdate(@ModelAttribute Email email, RedirectAttributes redirectAttributes){
        emailService.edit(email);
        redirectAttributes.addFlashAttribute("message","Update success");
        return "redirect:/email/";
    }
}
