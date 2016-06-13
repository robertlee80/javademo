package me.licq.javademo.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by robertlee on 6/11/16.
 */
@Controller
public class IndexController {

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/")
    public String index(){
        logger.debug("request /");
        return "index";
    }
}