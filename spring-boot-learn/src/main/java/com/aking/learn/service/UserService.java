package com.aking.learn.service;

import com.aking.learn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/11
 */
@Service
public class UserService {
    @Autowired
    private User user;

    public void say() {
        System.out.println("user = " + user);
    }
}
