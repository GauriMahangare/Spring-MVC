package com.avanengineering.conference.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
/**
 * Controllers
 - Handles request/response
 - No business logic
 -  Co-ordinate with service and repository
 - Annotated with @Controller
 - Handles exceptions and view routing
 * Services
 - Annotated with @Service
 - Describes verbs/actions of the system
 - Business logic belongs here
 - Ensures business object state
 - Transactional
 - Often same methods as repository
 * Repository
 - Annotated with @Repository
 - Nouns (data) of the system
 - Database interaction
 - one to one object mapping
 - often one to one database table mapping
 */
@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object>model){
        model.put("message", "Hello Gauri this is your first MVC app");
        return "greeting";
    }

}

