package com.aking.learn.pojo;

/**
 * @author yangkang
 * @date 2022/4/12
 */
public class Teacher {
    private String name;
    private String lesson;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(final String lesson) {
        this.lesson = lesson;
    }

    public String getAge() {
        return age;
    }

    public void setAge(final String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name='" + name + '\'' + ", lesson='" + lesson + '\'' + ", age='" + age + '\'' + '}';
    }
}
