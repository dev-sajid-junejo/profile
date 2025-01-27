package io.reflectoring.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/test")
    public String hello(Model model){
        model.addAttribute("message", "Hello from Spring MVC Thymeleaf");
        return "hello";
    }
}
