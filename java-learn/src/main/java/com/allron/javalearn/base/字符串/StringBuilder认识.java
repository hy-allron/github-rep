package com.allron.javalearn.base.字符串;

/**
 * StringBuilder线程不安全
 *
 * @author Allron
 * @date 2020/9/23
 */
public class StringBuilder认识 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //append方法没有同步
        stringBuilder.append(1);

        StringBuffer stringBuffer = new StringBuffer();
        //append方法使用了synchronized
        stringBuffer.append(1);
        System.out.println(3 << 2);
    }
}
class test{
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    sb.append("a");
                }		}).start();	}	// 睡眠确保所有线程都执行完
        Thread.sleep(1000);
        System.out.println(sb.length());
    }
}
