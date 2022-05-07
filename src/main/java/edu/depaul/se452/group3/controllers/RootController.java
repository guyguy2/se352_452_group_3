package edu.depaul.se452.group3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Group 3";
    }
}
