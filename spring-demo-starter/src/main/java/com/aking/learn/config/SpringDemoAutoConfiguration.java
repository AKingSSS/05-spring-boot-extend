package com.aking.learn.config;

import com.aking.learn.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangkang
 * @date 2022/4/11
 */
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class SpringDemoAutoConfiguration {
    @Autowired
    private DemoProperties demoProperties;

    @Bean
    public DemoService demoService() {
        final String name = demoProperties.getName();
        System.out.println("demoProperties.getName() = " + name);
        return new DemoService();
    }

}
