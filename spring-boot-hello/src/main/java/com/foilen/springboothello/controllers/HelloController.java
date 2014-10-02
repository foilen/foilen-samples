package com.foilen.springboothello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("main")
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "world";
    }

}
