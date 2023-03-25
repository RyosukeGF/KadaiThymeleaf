package com.kadai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("previous") String previous, Model model) {
        //"previous"という名前で、String previousに値がはいっている
        model.addAttribute("val", previous);
        return "output";
    }

}
