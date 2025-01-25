package com.springmvc.lc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.lc.api.UserInfoDTO;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO, HttpServletRequest request) {
		Cookie[] cookieArray = request.getCookies();
		for (Cookie cookieTemp : cookieArray) {
			if ("LcApp.userName".equalsIgnoreCase(cookieTemp.getName())) {
				String myUserName = cookieTemp.getValue();
				userInfoDTO.setUserName(myUserName);
			}
		}
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO,
			BindingResult bindingResult, HttpServletResponse response) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> errorList = bindingResult.getAllErrors();
			for (ObjectError temp : errorList)
				System.out.println(temp);
			System.out.println("Check Box : " + userInfoDTO.isCheckBox());
			System.out.println("There are errors!");
			return "home-page";
		}

		Cookie cookie = new Cookie("LcApp.userName", userInfoDTO.getUserName());
		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);

		return "result-page";
	}
}
