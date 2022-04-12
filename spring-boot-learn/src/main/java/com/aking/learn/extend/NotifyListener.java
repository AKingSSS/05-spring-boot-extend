package com.aking.learn.extend;

import com.aking.learn.pojo.NotifyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/12
 */
@Component
public class NotifyListener implements ApplicationListener<NotifyEvent> {
    @Override
    public void onApplicationEvent(final NotifyEvent event) {
        System.out.println("邮件地址：" + event.getEmail());
        System.out.println("邮件内容：" + event.getContent());
    }
}
