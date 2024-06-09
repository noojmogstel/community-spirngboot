package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
        return "Hello Page";
    }
    @GetMapping("/sbb2")
    @ResponseBody
    public String inde1x(){
        return "Hello Page";
    }
}
