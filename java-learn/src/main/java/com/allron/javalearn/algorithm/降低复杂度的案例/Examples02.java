package com.allron.javalearn.algorithm.降低复杂度的案例;

import java.util.HashMap;
import java.util.Map;

/**
 *查找出一个数组中，出现次数最多的那个元素的数值。例如，输入数组 a = [1,2,3,4,5,5,6 ] 中，查找出现次数最多的数值。
 * 从数组中可以看出，只有 5 出现了 2 次，其余都是 1 次。显然 5 出现的次数最多，则输出 5。
 * O(n^2) => O(n)
 * 使用合理的数据结果，空间换时间
 *
 * @author Allron
 * @date 2020/7/15
 */
public class Examples02 {

    public void s2_3() {
        int a[] = { 1, 2, 3, 4, 5, 5, 6 };
        int val_max = -1;
        int time_max = 0;
        int time_tmp = 0;
        for (int i = 0; i < a.length; i++) {
            time_tmp = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    time_tmp += 1;
                }
                if (time_tmp > time_max) {
                    time_max = time_tmp;
                    val_max = a[i];



                }
            }
        }
        System.out.println(val_max);
    }

    public void s2_4() {
        int a[] = { 1, 2, 3, 4, 5, 5, 6 };
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (d.containsKey(a[i])) {
                d.put(a[i], d.get(a[i]) + 1);
            } else {
                d.put(a[i], 1);
            }
        }
        int val_max = -1;
        int time_max = 0;
        for (Integer key : d.keySet()) {
            if (d.get(key) > time_max) {
                time_max = d.get(key);
                val_max = key;
            }
        }
        System.out.println(val_max);
    }

}
