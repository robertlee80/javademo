package me.licq.javademo.web.controller;

import me.licq.javademo.domain.User;
import me.licq.javademo.iservice.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by robertlee on 6/11/16.
 */
@Controller
public class IndexController {

    Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/")
    public String index(){
        logger.debug("request /");
        User user = userService.getUserByLoginId("robert");
        return "index";
    }
}