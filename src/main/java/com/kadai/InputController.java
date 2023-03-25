package com.kadai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {


    @GetMapping("/input")
    public String getInput() {
        return "input";
    }

/*
    @GetMapping("/input/'previous='+{previous}/")
    public String getInput(@PathVariable int previous, Model model) {
        model.addAttribute("previous", previous);
        return "input";
    }
*/
/*
    @GetMapping("/input/{previous}/")
    public String getInput(@PathVariable int previous, Model model) {
        model.addAttribute("previous", previous);
        return "output";
    }
*/
}
