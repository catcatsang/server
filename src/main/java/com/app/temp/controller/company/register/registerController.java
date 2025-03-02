package com.app.temp.controller.company.register;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = "/company/*")
public class registerController {

    @GetMapping(value = "register")
    public String register() {
        return "/login/company-register";
    }
}
