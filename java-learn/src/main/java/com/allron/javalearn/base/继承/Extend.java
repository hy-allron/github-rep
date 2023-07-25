package com.allron.javalearn.base.继承;

/**
 * 继承：
 * 使用已存在的类的定义作为基础建立新类，新类的定义可以增加新的数据或功能，也可以用父类的功能，但不能选择性的继承。
 * 通过使用继承可以很好的复用以前的代码
 *
 * 重点！！！
 * 1.子类拥有父类对象所有的属性和方法（包括私有属性和私有方法），但是父类中的私有属性和方法子类是无法访问的，只是拥有。
 * 2.子类可以拥有自己的属性和方法，即子类可以对父类进行扩展
 * 3.子类可以用自己的方式实现父类的方法
 *
 * @author Allron
 * @date 2020/6/16
 */
public class Extend {

    public String say(){
        return "hello";
    }

    static class Child extends Extend{

        public String extendParentMethod(){
            return super.say();
        }
    }
}
