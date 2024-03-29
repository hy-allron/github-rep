package edu.jiangxuan.up.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ServiceLoader;

public class LoggerService {
    private static final LoggerService SERVICE = new LoggerService();

    private final Logger logger;

    private LoggerService() {
        ServiceLoader<Logger> loader = ServiceLoader.load(Logger.class);
        List<Logger> list = new ArrayList<>();
        for (Logger log : loader) {
            list.add(log);
        }

        if (!list.isEmpty()) {
            // 随机获取一个实现类
            Random random = new Random();
            int i = random.nextInt(list.size());
            logger = list.get(i);
        } else {
            logger = null;
        }
    }

    public static LoggerService getService() {
        return SERVICE;
    }

    public void info(String msg) {
        if (logger == null) {
            System.out.println("info 中没有发现 Logger 服务提供者");
        } else {
            logger.info(msg);
        }
    }

    public void debug(String msg) {
        if (logger == null) {
            System.out.println("debug 中没有发现 Logger 服务提供者");
        } else {
            logger.info(msg);
        }
    }
}
