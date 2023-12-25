package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class OutputController {
    @PostMapping("/output")
    public String postInput(@RequestParam("val") String val, Model model) {
        model.addAttribute("val",val);
        return "output";
    }


}



