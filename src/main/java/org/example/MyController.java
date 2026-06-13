package org.example;

import org.example.services.FieldService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    private final FieldService fieldService;


    public MyController(FieldService fieldService) {
        this.fieldService = fieldService;
    }


    @GetMapping("/")
    public String getMainPage(Model model) {

        model.addAttribute("matrix", fieldService.getAll());
        return "main_page";
    }

}