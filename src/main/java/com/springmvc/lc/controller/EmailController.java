package com.springmvc.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.lc.api.EmailDTO;

@Controller
public class EmailController {

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
		model.addAttribute("emailDTO", new EmailDTO());
		return "send-email";
	}

	@RequestMapping("/process-email")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		return "process-email";
	}
}
