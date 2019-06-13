package com.app.start;

import java.time.LocalDateTime;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootQuickStartAppApplication.class);
	}
	@Controller
    public static class MyController {

        @RequestMapping("/")
        public String handler (Model model) {
            model.addAttribute("date",
                               LocalDateTime.now());
            return "index";
        }
    }

}
