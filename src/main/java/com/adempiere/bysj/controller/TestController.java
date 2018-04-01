package com.adempiere.bysj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wm on 2018/3/29.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/order")
    public String direct(){
        return "redirect:order.html";
    }
}
