package com.allron.javalearn.base.final学习;

import com.allron.javalearn.base.entity.Student;

public class FinalTest {
    
    private final Student student = new Student(1, "小明");
    
    public void printObject(){
        System.out.println(student);
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        finalTest.printObject();
        finalTest.student.setAge(2);
        finalTest.student.setName("小红");
        finalTest.printObject();
    }
}
