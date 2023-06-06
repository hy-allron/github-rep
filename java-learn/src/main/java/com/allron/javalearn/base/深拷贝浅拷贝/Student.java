package com.allron.javalearn.base.深拷贝浅拷贝;

import lombok.Data;

/**
 * @author hyshizhe
 */
@Data
public class Student implements Cloneable{
    private String name;
    private int age;
    private Major major;

    @Override
    public Student clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
