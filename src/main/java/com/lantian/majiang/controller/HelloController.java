package com.lantian.majiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2020/2/27 11:21
 * @Created wyt
 */
@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "success";
    }
}
