package com.allron.javalearn.leetcode;

/**
 * 描述：递归乘法。写一个递归函数，不使用*运算符，实现两个正整数的相乘。可以使用加号、减号、位移，但要吝啬些。 <br>
 * 作者：allron <br>
 * 修改日期：2021/10/28 9:44 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class 递归乘法 {

    public static void main(String[] args) {
        System.out.println(multiply(2, 4));
    }

    private static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (a == 1) {
            return b;
        }
        if (b == 1) {
            return a;
        }

        int t = multiply(a, b >> 1);
        if ((b & 1) == 1) {
            // 左移优先级低，需括号
            return t + multiply(a, (b >> 1) + 1);
        }
        return t << 1;
    }
}
