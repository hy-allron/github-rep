package com.allron.javalearn.base;

import com.allron.javalearn.base.entity.Student;

import java.util.HashMap;
import java.util.Map;

public class Map获取值后重新赋值再取map值 {

    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        Student student = new Student();
        student.setAge(18);
        student.setName("小明");
        System.out.println("原Student的地址：" + System.identityHashCode(student));
        map.put(1, student);
        System.out.println("存进map后的Student的地址：" + System.identityHashCode(map.get(1)));
        Student a = new Student();
        a.setAge(100);
        a.setName("老人");
        student = a;
        System.out.println("被a赋值后的Student的地址：" + System.identityHashCode(student));
        Student copyStudent = map.get(1);
        System.out.println("copyStudent的地址：" + System.identityHashCode(copyStudent));
        System.out.println(copyStudent.toString());
        copyStudent.setAge(22);
        copyStudent.setName("老王");
        System.out.println(map.get(1).toString());
        System.out.println(student.toString());



        /*List<Student> students = new ArrayList<>();
        students.add(student);
        System.out.println(students.get(0).toString());
        Student getListStudent = students.get(0);*/
    }
}
