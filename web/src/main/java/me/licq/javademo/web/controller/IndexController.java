package me.licq.javademo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by robertlee on 6/11/16.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
