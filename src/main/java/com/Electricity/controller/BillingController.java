package com.Electricity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Electricity.calculate.Calculator;

@Controller
public class BillingController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("calculator", new Calculator());
		return "index";
	}

	@PostMapping("/calculate")
	public String calculate(@ModelAttribute Calculator calculator,BindingResult result,Model model) {
		model.addAttribute("calculator", calculator);
		return "calculate";
	}
}