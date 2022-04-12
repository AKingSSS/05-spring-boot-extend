package com.aking.learn.pojo;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * @author yangkang
 * @date 2022/4/12
 */
public class NotifyEvent extends ApplicationEvent {
    private String email;
    private String content;

    public NotifyEvent(final Object source) {
        super(source);
    }

    public NotifyEvent(final Object source, final Clock clock, final String email, final String content) {
        super(source, clock);
        this.content = content;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }
}
