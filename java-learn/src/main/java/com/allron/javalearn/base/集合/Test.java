package com.allron.javalearn.base.集合;

import java.util.ArrayList;
import java.util.List;

/**
 * ***
 *
 * @author Allron
 * @date 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        List<Student> list =new ArrayList<Student>();
        Student student = new Student();
        for (int i = 0; i < 3; i++) {
            student.age=i;
            list.add(student);
        }
        for (Student stu : list) {
            System.out.println(stu.age);//理论上结果应该是0，1，2 但实际上是 2 2 2
        }
    }
}
class Student{
    public int age;
}
