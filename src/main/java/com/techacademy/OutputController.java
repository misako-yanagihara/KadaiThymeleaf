package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class OutputController {
    @PostMapping("/output")
    public String postInput(@RequestParam(name = "val", required = false) String val, Model model) {
        model.addAttribute("val",val);
        return "output";
    }

public class LinkController{

    @GetMapping("/previous")
    public String getLink(Model model) {
        model.addAttribute("name", "val");
        return "previous";

    }
}


}
