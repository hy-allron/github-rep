package com.allron.javalearn.thread.全局变量;

import lombok.Data;

/**
 * 计数类
 *
 * @author Allron
 * @date 2020/6/28
 */
@Data
public class Count {

    private Integer countNum = 0;

    public void count() {
        for (int i = 1; i <= 10; i++) {
            countNum = countNum + i;
        }
        System.out.println(Thread.currentThread().getName() + "-" + countNum);
    }
}
