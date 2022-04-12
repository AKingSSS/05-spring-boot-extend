package com.aking.learn.extend;

import com.aking.learn.pojo.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.support.AbstractBeanDefinition.AUTOWIRE_BY_NAME;

/**
 * @author yangkang
 * @date 2022/4/11
 * 自定义bean并注册到BeanDefinitionRegistry
 */
@Component
public class UserPostProcessorRegistration implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(final BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("******调用BeanDefinitionRegistryPostProcessor开始");
        //创建BeanDefinitionBuilder
        final BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(User.class);
        //设置属性值
        beanDefinitionBuilder.addPropertyValue("name", "UserPostProcessorRegistration");
        //设置可通过@Autowire注解引用
        beanDefinitionBuilder.setAutowireMode(AUTOWIRE_BY_NAME);
        //注册到BeanDefinitionRegistry
        beanDefinitionRegistry.registerBeanDefinition("user", beanDefinitionBuilder.getBeanDefinition());
        System.out.println("******调用BeanDefinitionRegistryPostProcessor结束");
    }

    @Override
    public void postProcessBeanFactory(final ConfigurableListableBeanFactory configurableListableBeanFactory)
        throws BeansException {

    }
}
