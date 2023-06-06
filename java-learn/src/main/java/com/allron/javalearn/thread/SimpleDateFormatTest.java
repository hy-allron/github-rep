package com.allron.javalearn.thread;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * 解读阿里巴巴Java手册：为什么禁止把SimpleDateFormat设为static
 *
 * @author allron
 * @date 2022/11/21 11:24
 */
public class SimpleDateFormatTest {
    //定义一个静态SimpleDateFormat
//    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //线程数量
    static int num = 100;
    //定义同步辅助工具，主线程等待所有子线程执行完毕
    private static CountDownLatch countDownLatch = new CountDownLatch(num);

    public static void main(String[] args) throws InterruptedException {
        //一个线程安全的set,去重
        Set<String> dateSet = Collections.synchronizedSet(new HashSet<>());
        for (int i = 0; i < num; i++) {
            int j = i;
            new Thread() {
                @Override
                public void run() {
                    //获取使用默认时区和地区的日历。返回的日历基于默认时区中的当前时间
                    Calendar calendar = Calendar.getInstance();
                    //每次循环在当天是的时间上+i天，理想状态下最后时间是当前时间的100天后
                    calendar.add(Calendar.DATE, j);
                    //格式化
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String dateString = simpleDateFormat.format(calendar.getTime());
                    System.out.println(j + ": " + dateString);
                    //把字符串放入Set中
                    dateSet.add(dateString);
                    //countDown
                    countDownLatch.countDown();
                }
            }.start();
        }
        //阻塞，直到countDown数量为0
        countDownLatch.await();
        //输出去重后的时间个数
        System.out.println(dateSet.size());
    }
}
