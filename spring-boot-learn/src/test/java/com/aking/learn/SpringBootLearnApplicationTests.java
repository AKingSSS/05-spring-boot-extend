package com.aking.learn;

import com.aking.learn.extend.BaseFactory;
import com.aking.learn.pojo.NotifyEvent;
import com.aking.learn.pojo.Teacher;
import com.aking.learn.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import java.time.Clock;

@SpringBootTest
class SpringBootLearnApplicationTests {
    @Autowired
    private UserService userService;

    @Autowired
    private BaseFactory baseFactory;

    @Autowired
    private Teacher teacher;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    void contextLoads() {
        userService.say();
    }

    @Test
    void contextLoads2() {
        final BeanFactory beanFactory = baseFactory.getBeanFactory();
        final UserService userService = beanFactory.getBean("userService", UserService.class);
        userService.say();
    }

    @Test
    void contextLoads3() {
        System.out.println("teacher = " + teacher);
    }

    @Test
    void contextLoads4() {
        final NotifyEvent event =
            new NotifyEvent("object", Clock.systemUTC(), "1877823@qq.com", "happy every day");
        webApplicationContext.publishEvent(event);
    }
}
