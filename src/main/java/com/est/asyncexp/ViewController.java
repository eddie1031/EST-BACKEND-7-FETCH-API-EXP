package com.est.asyncexp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/page/1")
    public String page1() {
        return "page1";
    }

}
