package com.soumyadeep.spring.springmvc.controller;

import com.soumyadeep.spring.springmvc.dto.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("registrationPage")
    public String viewRegistrationPage() {
        // ModelAndView modelAndView = new ModelAndView();
        // modelAndView.setViewName("userReg");
        return "userReg";
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
        System.out.println(user);
        // ModelAndView modelAndView = new ModelAndView();
        // modelAndView.addObject("user", user);
        // modelAndView.setViewName("regResult");

        model.addAttribute("user", user);

        return "regResult";
    }
}