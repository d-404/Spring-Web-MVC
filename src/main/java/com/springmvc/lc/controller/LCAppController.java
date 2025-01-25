package com.springmvc.lc.controller;

import com.springmvc.lc.api.UserInfoDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO) {
        return "home-page";
    }

    @RequestMapping("/process-homepage")
    public String showResultPage(@Valid @ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errorList = bindingResult.getAllErrors();
            for (ObjectError temp : errorList)
                System.out.println(temp);
            System.out.println("Check Box : " + userInfoDTO.isCheckBox());
            System.out.println("There are errors!");
            return "home-page";
        }
        return "result-page";
    }
}
