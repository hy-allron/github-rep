package edu.jiangxuan.up.spi.service;

import edu.jiangxuan.up.spi.Logger;

/**
 * TODO
 *
 * @author allron
 * @date 2023/8/10 15:54
 */
public class Log4j implements Logger {
    @Override
    public void info(String s) {
        System.out.println("Log4j info 打印日志：" + s);
    }

    @Override
    public void debug(String s) {
        System.out.println("Log4j debug 打印日志：" + s);
    }
}
