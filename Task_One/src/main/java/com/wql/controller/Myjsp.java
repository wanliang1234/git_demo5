package com.wql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Myjsp
{
    @RequestMapping("/myjsp")
    public String myjsp(Model model)
    {
        model.addAttribute("data","SrpingBoot使用Jsp");
        return "index";
    }
}
