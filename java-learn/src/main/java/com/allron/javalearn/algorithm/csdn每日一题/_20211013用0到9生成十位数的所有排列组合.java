package com.allron.javalearn.algorithm.csdn每日一题;

/**
 * 描述：用 0到9 生成 十位数的所有排列组合，数字0不能在第一个，这个生成的十位数，不能有重复的数字。 <br>
 * 作者：allron <br>
 * 修改日期：2021/10/14 9:48 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class _20211013用0到9生成十位数的所有排列组合 {
}

class java_234859_C {
    public static void main(String[] args) {
        String str[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        permutation(str, 0, str.length);
    }

    static void swap(String[] str, int start, int end) {
        String tmep = str[start];
        str[start] = str[end];
        str[end] = tmep;
    }

    static void permutation(String[] str, int start, int end) {
        if (start == end - 1) {
            for (int i = 0; i < end; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
        } else {
            for (int i = start; i < end; i++) {
                if (i <= 0 && str[0].equals("0"))
                    continue;
                swap(str, start, i);
                permutation(str, start + 1, end);
                swap(str, start, i);
            }
        }
    }
}

/**
 * 官方给出的正确答案是D
 */
class java_234859_D {
    public static void main(String[] args) {
        String str[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        permutation(str, 0, str.length);
    }

    static void swap(String[] str, int start, int end) {
        String tmep = str[start];
        str[start] = str[end];
        str[end] = tmep;
    }

    static void permutation(String[] str, int start, int end) {
        if (start == end - 1) {
            for (int i = 0; i < end; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
        } else {
            for (int i = start; i < end; i++) {
                if (i == 0 && str[0].equals("0"))
                    continue;
                swap(str, start, i);
                permutation(str, start + 1, end);
                swap(str, start, i);
            }
        }
    }
}
