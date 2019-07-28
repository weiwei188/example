package com.firstspringboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AnotherHtmlController {
    @RequestMapping("/index")
        public String returnView(){ return "index2.html"; }
}
