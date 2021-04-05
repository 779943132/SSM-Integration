package com.test.controller;


import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //将其注册到spring
@RequestMapping("/这里写主的请求路径")
public class 这里写controller {
    @RequestMapping("/这里写这个方法的路径")
    public String test(Model model){
        model.addAttribute("key","value");
        return "/这里写要跳转的页面名";
    }
}
