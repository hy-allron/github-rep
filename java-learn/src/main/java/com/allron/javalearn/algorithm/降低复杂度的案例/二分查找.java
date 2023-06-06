package com.allron.javalearn.algorithm.降低复杂度的案例;

/**
 * 二分查找的两种方式
 *
 * @author Allron
 * @date 2020/9/27
 */
public class 二分查找 {
    //二分查找(循环)
    private static int test01(int[] array, int key) {
        int low = 0;
        int hight = array.length - 1;
        int middle = 0;
        while (low <= hight) {
            middle = (low + hight) / 2;
            if (array[middle] > key) {
                //key在左边
                hight = middle - 1;
            } else if (array[middle] < key) {
                //key在右边
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    //递归
    private static int test02(int[] array, int key, int height, int low){
        if(low > height){
            return -1;
        }
        int middle = (low + height)/2;
        if(array[middle] > key){
            //left
            return test02(array, key, middle -1, low);
        }else if(array[middle] < key){
            //right
            return test02(array, key, height, middle + 1);
        }else{
            return middle;
        }
    }

    public static void main(String[] args) {

    }
}
