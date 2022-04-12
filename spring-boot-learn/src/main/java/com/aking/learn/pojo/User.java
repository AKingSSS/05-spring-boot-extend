package com.aking.learn.pojo;

/**
 * @author yangkang
 * @date 2022/4/11
 */
public class User {
    private String name;

    private String introduce;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(final String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", introduce='" + introduce + '\'' + '}';
    }
}
