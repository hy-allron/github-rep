package com.allron.javalearn.algorithm.降低复杂度的案例;

/**
 * 第 1 个例子
 * 假设有任意多张面额为 2 元、3 元、7 元的货币，现要用它们凑出 100 元，求总共有多少种可能性。
 * O(n^3) => O(n^2)
 *
 * @author Allron
 * @date 2020/7/15
 */
public class Examples01 {

    public void s2_1() {
        int count = 0;
        for (int i = 0; i <= (100 / 7); i++) {
            for (int j = 0; j <= (100 / 3); j++) {
                for (int k = 0; k <= (100 / 2); k++) {
                    if (i * 7 + j * 3 + k * 2 == 100) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public void s2_2() {
        int count = 0;
        for (int i = 0; i <= (100 / 7); i++) {
            for (int j = 0; j <= (100 / 3); j++) {
                if ((100-i*7-j*3 >= 0)&&((100-i*7-j*3) % 2 == 0)) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }

}
