package com.deepakcroy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/contact")
public class ContactController {
	@GetMapping("/")
    public String index(Model model) {
		model.addAttribute("contentFragment", "fragments/contact/indexFragment");
		return "layout/mainLayout";
    }
}
