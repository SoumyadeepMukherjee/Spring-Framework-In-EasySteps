package com.soumyadeep.spring.springmvcorm.user.controller;

import java.util.List;

import com.soumyadeep.spring.springmvcorm.user.entity.User;
import com.soumyadeep.spring.springmvcorm.user.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }

    @RequestMapping("/registrationPage")
    public String showRegistrationPage() {
        return "userReg";
    }

    public @ResponseBody String validateEmail(@RequestParam int id) {
        User user = service.getUser(id);
        String msg = "";
        if (user != null)
            msg = id + " already exists";

        return msg;
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
        int result = service.save(user);
        model.addAttribute("result", "User created with ID" + result);
        return "userReg";
    }

    @RequestMapping("/getUsers")
    public String getuser(ModelMap model) {
        List<User> users = service.getUsers();
        model.addAttribute("users", users);

        return "displayUser";
    }

}