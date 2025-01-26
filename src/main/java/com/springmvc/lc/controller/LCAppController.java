package com.springmvc.lc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.lc.api.UserInfoDTO;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("userInfoDTO")
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(Model model) {
//		Cookie[] cookieArray = request.getCookies();
//		for (Cookie cookieTemp : cookieArray) {
//			if ("LcApp.userName".equalsIgnoreCase(cookieTemp.getName())) {
//				String myUserName = cookieTemp.getValue();
//				userInfoDTO.setUserName(myUserName);
//			}
//		}
		model.addAttribute("userInfoDTO", new UserInfoDTO());
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> errorList = bindingResult.getAllErrors();
			for (ObjectError temp : errorList)
				System.out.println(temp);
			System.out.println("Check Box : " + userInfoDTO.isCheckBox());
			System.out.println("There are errors!");
			return "home-page";
		}

//		HttpSession session = request.getSession();
//		session.setAttribute("userName", userInfoDTO.getUserName());
//		session.setMaxInactiveInterval(120);

		return "result-page";
	}
}
