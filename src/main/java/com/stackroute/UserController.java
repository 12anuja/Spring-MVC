package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class UserController {


    @Autowired
    User user;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String user(Model model) {

            user.setName("Anuja");
            String msg = "Hello " + user.getName();
            //add a message to the model
            model.addAttribute("msg", msg);
            return "index";
    }
}
