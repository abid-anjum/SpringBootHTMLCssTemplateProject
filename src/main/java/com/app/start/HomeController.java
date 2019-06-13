package com.app.start;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String handler (Model model) {
        model.addAttribute("date",
                           LocalDateTime.now());
        return "index";
    }
    
    @RequestMapping("/experience")
    public String experiencehander (Model model) {
        model.addAttribute("date",
                           LocalDateTime.now());
        return "experience";
    }
    
    @RequestMapping("/resume")
    public String resumehandler (Model model) {
        model.addAttribute("date",
                           LocalDateTime.now());
        return "resume";
    }
    
    @RequestMapping("/contact")
    public String contacthandler (Model model) {
        model.addAttribute("date",
                           LocalDateTime.now());
        return "contactus";
    }
    
}
