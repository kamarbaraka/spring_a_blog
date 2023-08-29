package com.kamar.spring_a_blog.app.presentation.controllers;

import com.kamar.spring_a_blog.app.business.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * the user controller to serve form to get user details.
 * @author kamar baraka.*/

@Controller
public class UserController {

    /*define the logger*/
    private final Log logger = LogFactory.getLog(UserController.class);

    /**
     * maps and handles the "/create-user" uri.
     * @param model the model of this controller.
     * @return the view.*/
    @GetMapping(value = {"/create-user"})
    public String showCreateUserPage(ModelMap model){

        /*set the model attribute as the user*/
        model.addAttribute("user", new User());

        /*return the user view*/
        return "user";
    }
}
