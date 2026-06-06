package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {



    @GetMapping("/hello_1")
    @ResponseBody
    public String sayHello() {
        return "hello";
    }

}
