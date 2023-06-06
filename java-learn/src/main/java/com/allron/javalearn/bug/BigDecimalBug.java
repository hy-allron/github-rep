package com.allron.javalearn.bug;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * BigDecimal精度问题
 *
 * @author Allron
 * @date 2020/03/15
 **/
@Slf4j
public class BigDecimalBug {

    public static void main(String[] args) {
        Double value1 = 0.11D;
        BigDecimal value2 = new BigDecimal(value1);
        BigDecimal value3 = BigDecimal.valueOf(value1);
        log.info(value1.toString());
        log.info(value2.toString());
        log.info(value3.toString());
    }
}
