package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("index")
@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("msg","我的第一个信息");
        model.addAttribute("msg1","<h2>普通字符串</h2>");
        model.addAttribute("msg2","<h2>普通字符串</h2>");
        return "index"; //基于约定优于配置，默认会到 /templates/  .html
    }

}