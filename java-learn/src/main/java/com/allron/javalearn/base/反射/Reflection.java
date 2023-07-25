package com.allron.javalearn.base.反射;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ***
 *
 * @author Allron
 * @date 2020/9/21
 */
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式一 对象.getClass()方法获取反射对象
        System.out.println(new Student().getClass());

        //方式二 类名.class
        System.out.println(Student.class);

        //方式三 Class.forName()
        System.out.println(Class.forName("com.allron.javalearn.Student"));
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student{

    private Integer id;
    private String name = "小明";
}
