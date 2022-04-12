package com.aking.learn.controller;

import com.aking.learn.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangkang
 * @date 2022/4/11
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;


    @GetMapping("/say")
    public void say() {
        demoService.say("我");
    }
}
