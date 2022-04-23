package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("/example")
    public String web() {
        return "index";
    }
    @RequestMapping("/users")
    public String users() throws JsonProcessingException {
      return UsersController.view();
    }

}