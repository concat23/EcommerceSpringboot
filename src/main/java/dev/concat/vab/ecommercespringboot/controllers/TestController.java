package dev.concat.vab.ecommercespringboot.controllers;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "tests")
public class TestController {

    @RequestMapping(path ="/send", method = RequestMethod.GET)
    public String test(ModelMap modelMap){
        return "What's up !";
    }
}
