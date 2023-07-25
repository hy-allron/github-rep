package com.allron.javalearn.bug;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化YYYY-MM-DD HH:MM:SS跨年的BUG
 * <p>
 * 日期格式化字符串[%s]使用错误，应注意使用小写‘y’表示当天所在的年，大写‘Y’代表week in which year。
 * 日期格式化时，yyyy表示当天所在的年，而大写的YYYY代表是week in which year（JDK7之后引入的概念），
 * 意思是当天所在的周属于的年份，一周从周日开始，周六结束，只要本周跨年，返回的YYYY就是下一年
 *
 * @author Allron
 * @date 2020/01/05
 **/
public class DateFormatBug {

    private static void printBugDate() throws ParseException {
        /**
         * 日期格式化字符串[%s]使用错误，应注意使用小写‘y’表示当天所在的年，大写‘Y’代表week in which year。
         * 日期格式化时，yyyy表示当天所在的年，而大写的YYYY代表是week in which year（JDK7之后引入的概念），
         * 意思是当天所在的周属于的年份，一周从周日开始，周六结束，只要本周跨年，返回的YYYY就是下一年
         */
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-1-1 13:12:12");
        System.out.println(date);
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
    }

    private static void printBugDateExtend() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date = sdf.parse("2019-12-31 13:12:12");
        System.out.println(date);
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
    }

    public static void main(String[] args) throws ParseException {
        // 示例一
        printBugDate();
        //示例二
        printBugDateExtend();
    }
}
