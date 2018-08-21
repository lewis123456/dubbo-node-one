package org.lewis.dubbo.node.one.controller;

import lombok.extern.log4j.Log4j;
import org.lewis.dubbo.node.one.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Log4j
public class UserController {
    @Autowired
    @Qualifier("org.lewis.dubbo.node.one.UserService")
    private UserService userService;

    @RequestMapping("getUserName")
    public String getUserName() {
        log.info("getUserName");
        return userService.getUserName();
    }
    @RequestMapping("getUserPassword")
    public String getUserPassword() {
        log.info("getUserPassword");
        return userService.getUserPassword();
    }
    @RequestMapping("getServerPort")
    public int getServerPort() {
        log.info("getServerPort");
        return userService.getServerPort();
    }
}
