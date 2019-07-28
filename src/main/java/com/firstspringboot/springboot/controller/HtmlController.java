package com.firstspringboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//返回视图
//指定一个Controller的标记，用来被Spring扫描到
@Controller
//表示在url上需要通过/的方式来访问
@RequestMapping("/")
public class HtmlController {
    public String returnView(){
        return "index.html";
    }
}









