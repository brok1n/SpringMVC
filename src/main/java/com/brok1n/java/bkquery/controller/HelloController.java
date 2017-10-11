package com.brok1n.java.bkquery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response ){
        return "login";
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(HttpServletRequest request, HttpServletResponse response ){
        return "this is a login return result ";
    }

}
