package com.avanengineering.conference.controller;

import com.avanengineering.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String postRegistration(@ModelAttribute("registration")Registration registration){

        System.out.println("Registration: "+  registration.getName());
        /* adding redirect to stop the back form submission - Design pattern - Post Redirect Get -
         avoids resubmit of form data */
        return "redirect:registration";
    }

}
