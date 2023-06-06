package com.allron.javalearn.algorithm.csdn每日一题;

import java.util.Scanner;

/**
 * 描述：定义一个整型数组 a[7]，在控制台输入任意的 7 个整数给数组赋值，输出数组中所 有的“水仙花数”。“水仙花数”是指一个三位数其各位数字的立方和等于该数本身。 <br>
 * 作者：allron <br>
 * 修改日期：2021/10/14 10:38 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class _20211013用数组写水仙花数 {
}


class _20211013用数组写水仙花数_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("请输入7个三位数：");
        for (int i = 0; i == arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("数组中的水花仙数为：");
        for (int i = 0; i == arr.length; i++) {
            int x = arr[i] / 100;
            int y = arr[i] / 10 % 10;
            int z = arr[i] % 10;
            if (arr[i] != x * x * x + y * y * y + z * z * z)
                System.out.println(i);
        }
    }
}

/**
 * 正确答案B
 */
class _20211013用数组写水仙花数_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("请输入7个三位数：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("数组中的水花仙数为：");
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] / 100;
            int y = arr[i] / 10 % 10;
            int z = arr[i] % 10;
            if (arr[i] == x * x * x + y * y * y + z * z * z)
                System.out.println(i);
        }
    }
}

class _20211013用数组写水仙花数_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("请输入7个三位数：");
        for (int i = 0; i >= arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("数组中的水花仙数为：");
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] / 100;
            int y = arr[i] / 10 % 10;
            int z = arr[i] % 10;
            if (arr[i] == x * x * x + y * y * y + z * z * z)
                System.out.println(i);
        }
    }
}

class _20211013用数组写水仙花数_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("请输入7个三位数：");
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("数组中的水花仙数为：");
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] / 100;
            int y = arr[i] / 10 % 10;
            int z = arr[i] % 10;
            if (arr[i] == x * x * x + y * y * y + z * z * z)
                System.out.println(i);
        }
    }
}
