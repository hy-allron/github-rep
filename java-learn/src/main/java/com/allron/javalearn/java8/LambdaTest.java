package com.allron.javalearn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Lambda学习
 * @author Allron
 * @date 2019/10/08
 **/
public class LambdaTest {

    public static void main(String[] args) {
        method6();
    }
    
    static void method1(){
        // Java8之前
        List<String> stringList = Arrays.asList("foo", "bar");
        for (String str: stringList) {
            System.out.println(str);
        }

        //Java8
        //普通打印
        stringList.forEach(str -> System.out.println(str));
        //使用Java8方法引用("::"双冒号操作符表示)
        stringList.forEach(System.out::println);
    }

    static void method2(){
        //函数式接口Predicate
        System.out.println("函数式接口Predicate");
        List<String> languages = Arrays.asList("Java", "C++", "C#");
        System.out.println("打印J开头的字符串");
        filter(languages, (s -> s.startsWith("J")));
        System.out.println("打印a结尾的字符串");
        filter(languages, s -> s.endsWith("a"));
        System.out.println("打印全部语言");
        filter(languages, s -> true);
        //and
        System.out.println("使用and连接两个Predicate条件");
        Predicate<String> startPredicate = (s -> s.startsWith("J"));
        Predicate<String> endPredicate = s -> s.endsWith("+");
        languages.stream()
                .filter(startPredicate.or(endPredicate))
                .forEach(System.out::println);
    }

    static void method3(){
        // 不使用lambda表达式为每个订单加上12%的税
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            System.out.println(price);
        }
        System.out.println("============split==========");
        // 使用lambda表达式
        List<Integer> costBeforeTax2 = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax2.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
    }
    
    static void method4(){
        // Map Reduce
        // 为每个订单加上12%的税
        // 老方法：
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            total = total + price;
        }
        System.out.println("Total : " + total);

        // 新方法：
        //double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce(Double::sum).get();
        System.out.println("Total : " + bill);
    }
    
    private static void method5(){
        List<String> strList = Arrays.asList("a", "bb", "ccc", "dde");
        // 创建一个字符串列表，每个字符串长度大于2
        List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
    }
    
    private static void method6(){
        // 将字符串换成大写并用逗号链接起来
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        // String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        String G7Countries = G7.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }
    
    static void filter(List<String> names, Predicate<String> predicate) {
        //写法1
        /*names.forEach(name -> {
            if(predicate.test(name)){
                System.out.println(name);
            }
        });*/
        //写法2
        //names.stream().filter(s -> (predicate.test(s))).forEach(name -> System.out.println(name));
    }
}

