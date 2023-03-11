package com4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class usercontroller {
    @GetMapping("signup1")
    public String signupform(){
        return "signup.html";
    }
    
    @GetMapping("login1")
    public String loginform(){
        return "redirect:/login.html";
    }
}
/* @PostMapping("/user")
public String homepage(@ModelAttribute user user){
    //return "home.html";
    return "redirect:/home.html";
} */