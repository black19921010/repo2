package com.sunday.dianshang.controller;

import com.sunday.dianshang.entity.UserDo;
import com.sunday.dianshang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Sunday
 * @date 2020/5/22
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserService userService;

    @Autowired
    private Environment environment;

    @GetMapping("/index")
    public List<UserDo> index() {
        System.out.println(environment.getProperty("server.port"));
        return userService.selectUsers();
    }
}
