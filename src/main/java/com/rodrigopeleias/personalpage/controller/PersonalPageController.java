package com.rodrigopeleias.personalpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalPageController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Rodrigo Peleias");
		return "index";
	}
}
