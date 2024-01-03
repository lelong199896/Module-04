package com.codegym.controller;

import com.codegym.model.entity.Product;
import com.codegym.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/products")
public class ProductController {
  @Autowired
    private IProductService productService;

    @GetMapping("")
    public String products(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/productList";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("products", new Product());
        return "/createProduct";
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 10000));
        productService.create(product);
        redirectAttributes.addFlashAttribute("Success", "Create customer successfully!");
        return "redirect:/products";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("products", productService.findById(id));
        return "/deleteProduct";
    }

    @PostMapping("delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("Success", "Removed product successfully");
        return "redirect:/products";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("products", productService.findById(id));
        return "/updateProduct";
    }

    @PostMapping("/edit")
    public String edit(Product product, RedirectAttributes redirectAttributes) {
        productService.update(product.getId(),product);
        redirectAttributes.addFlashAttribute("Success", "Update product successfully");
        return "redirect:/products";
    }

    @GetMapping("/{id}/productDetail")
    public String productDetail(@PathVariable int id, Model model) {
        model.addAttribute("products", productService.findById(id));
        return "/productDetail";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam String name, Model model) {
        model.addAttribute("products", productService.searchByName(name));
        return "/productList";
    }
}
