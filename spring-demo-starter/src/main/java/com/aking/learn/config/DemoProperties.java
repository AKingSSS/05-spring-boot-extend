package com.aking.learn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yangkang
 * @date 2022/4/11
 */
@ConfigurationProperties(prefix = "spring.demo")
public class DemoProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
