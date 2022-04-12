package com.aking.learn.extend;

import com.aking.learn.pojo.Teacher;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/12
 */
@Component
public class TeacherFactoryBean implements FactoryBean<Teacher> {
    @Override
    public Teacher getObject() throws Exception {
        final Teacher teacher = new Teacher();
        teacher.setAge("24");
        teacher.setLesson("math");
        teacher.setName("wu");
        return teacher;
    }

    @Override
    public Class<?> getObjectType() {
        return Teacher.class;
    }
}
