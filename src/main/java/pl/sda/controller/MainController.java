package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String view() {
        return "index";
    }

    @PostMapping("/send")
    public String process(@ModelAttribute("xlsx-file") String fileContent) {
        return "index";
    }

}
