package com.springmvc.lc.controller;

import java.util.List;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.lc.api.CommunicationDTO;
import com.springmvc.lc.api.PhoneDTO;
import com.springmvc.lc.api.UserRegistrationDTO;
import com.springmvc.lc.propertyeditor.NamePropertyEditor;

import jakarta.validation.Valid;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO) {
		PhoneDTO phone = new PhoneDTO();
		phone.setCountryCode("+91");
		phone.setUserNumber("978979879");
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		return "user-registration-page";
	}

	@RequestMapping("/registration-success")
	public String processUserRegistration(
			@Valid @ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO,
			BindingResult result) {
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError error : allErrors)
				System.out.println("Error Message : " + error);
			return "user-registration-page";
		}
		return "registration-success";
	}

	@InitBinder("userReg")
	public void initBinder(WebDataBinder binder) {
		System.out.println("Init Binder method..");
		StringTrimmerEditor editor = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "name", editor);

		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", nameEditor);
	}
}
