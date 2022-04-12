package com.aking.learn.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/11
 */
@Component
public class UserBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(final ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("******调用BeanFactoryPostProcessor开始");
        //获取到Spring中所有的beanName
        final String[] beanStr = beanFactory.getBeanDefinitionNames();
        //循环bean做出自定义的操作
        for (final String beanName : beanStr) {
            if ("user".equals(beanName)) {
                final BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
                System.out.println("修改user的name值");
                beanDefinition.getPropertyValues().add("name", "UserBeanFactoryPostProcessor");
            }
        }
        System.out.println("******调用BeanFactoryPostProcessor结束");
    }
}
