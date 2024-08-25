package com.deepakcroy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class HomeController {
	@GetMapping("/")
    public String home(Model model) {
		model.addAttribute("contentFragment", "fragments/home/homeFragment");
		return "layout/mainLayout";
    }
}
