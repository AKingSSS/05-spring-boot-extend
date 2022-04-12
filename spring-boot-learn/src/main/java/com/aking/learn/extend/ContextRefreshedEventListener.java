package com.aking.learn.extend;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/12
 */
@Component
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        // 打印容器中初始的Bean的数量
        System.out.println("event.getApplicationContext().getBeanDefinitionCount() = " + event.getApplicationContext()
            .getBeanDefinitionCount());
    }
}
