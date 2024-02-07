package com.sean.Ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class WebController{
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }
     @GetMapping("/hello3")
    public String hello3() {
        return "hello3";
    }
    @GetMapping("/hello4")
    public String hello4(Model model) {
        model.addAttribute("message", "Hello world! ");
        model.addAttribute("name", "Sean");
        return "hello4";
    }

    @GetMapping("/product")
    public String getProduct(Model model) {
        Product product = new Product("Macbook Pro", "Macbook Pro 16-inch M2 Pro, 16 GB RAM", 2499.00f, 10);
        product.setId(8);
        model.addAttribute("product", product);  
        return "product";
    }
}


